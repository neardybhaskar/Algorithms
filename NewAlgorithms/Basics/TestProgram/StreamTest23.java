/*
Implement generateCategoryReport to:
- Create a CategoryReport for each category with:
- categoryName
- List of product names
- Total value (sum of product prices)
- Return the list sorted by total value (highest first)
- Use ProductRepository and CategoryRepository, use DI, don't change existing models
*//*

@Data
@Builder
class Product {
    Long id;
    Long categoryId;
    String name;
    Double price;
}

@Data
@Builder
class Category {
    Long id;
    String name;
}

@Data
@Builder
class CategoryReport {
    String categoryName;
    List<String> productNames;
    Double totalValue;
}

@Repository
interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
}

@Repository
interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAll();
}


public class ReportService {

    @Autowire
    CategoryRepository categoryRepository;

    @Autowire
    ProductRepository productRepository;

    public List<CategoryReport> generateCategoryReport() {
        List<Product> productList = productRepository.findAll();
        List<Category> categoryList = categoryRepository.findAll();
        List<Product> categoryProducts = new ArrayList<>();
        Map<Long, List<Product>> productsByCategory = productList.stream()
                .collect(Collectors.groupingBy(Product::getCategoryId));

        List<CategoryReports> categoryReports = categoryList.stream()
                .map(category ->
                {
                    productsByCategory.getOrDefault(category.getId(), List.of());

                    List<String> productNames = categoryProducts.stream()
                            .map(Product::getName).collect(Collectors.toList());

                    double totalValue = categoryProducts.stream().mapToDouble(Product::getPrice).sum();

                    CategoryReport.builder().categoryName(category.getName()).productNames(productNames).totalValue(totalValue)
                            .build()
                }).sorted(Comparator.compare(CategoryReport::getTotalValue).reverse()).collect(Collectors.toList());
        return categoryReports;
    }


    @ExtendWith(MockitoExtension.class)
    class ReportServiceTest {

        @Mock
        private ProductRepository productRepository;

        @Mock
        private CategoryRepository categoryRepository;

        @InjectMocks
        private ReportService reportService;

        @Test
        void shouldGenerateCategoryReportWithValidData() {
            List<Product> products = List.of(
                    new Product(1L, 10L, "Laptop", 1200.0),
                    new Product(2L, 10L, "Mouse", 25.0),
                    new Product(3L, 10L, "M
                            onitor", 300.0),
            new Product(4L, 20L, "Chair", 80.0),
                    new Product(5L, 20L, "Desk", 150.0),
                    new Product(6L, 30L, "Notebook", 5.0)
        );

            List<Category> categories = List.of(
                    new Category(10L, "Electronics"),
                    new Category(20L, "Furniture"),
                    new Category(30L, "Stationery")
            new Category(40L,"Mobies")
        );

            List<CategoryReport> expected = List.of(
                    CategoryReport.builder()
                            .categoryName("Electronics")
                            .productNames(List.of("Laptop", "Mouse", "Monitor"))
                            .totalValue(1525.0)
                            .build(),
                    CategoryReport.builder()
                            .categoryName("Furniture")
                            .productNames(List.of("Desk"))
                            .totalValue(230.0)
                            .build(),
                    CategoryReport.builder()
                            .categoryName("Stationery")
                            .productNames(List.of("Notebook"))
                            .totalValue(5.0)
                            .build()
            );


            when(productRepository.findAll()).thenReturn(products);
            when(categoryRepository.findAll()).thenReturn(categories);

            var actualResult = reportService.generateCategoryReport();

            assertEquals(expected, actualResult);
        }
    }

    import java.util.List;
import java.util.Collections;

    public class WordCounter {

        private List<String> words;

        public WordCounter(List<String> words) {
            this.words = words;
        }

        // Count occurrences of the given word with case sensitivity option
        public long countOccurences (String input, boolean caseSensitivity) {
            for(int i=0; i<words.length; i++) {
                int count = 0;
                if(caseSensitivity) {
                    count = words.stream().filter(e->e.equals(input)).count();
                } else {
                    count = words.stream().filter(e -> e.equalsIgnoreCase(input)).count();
                }
            }
            return count;
        }
        // ['Java', 'Python', 'Go', 'Java', 'Java'], countOccurences('java', false) -> 3
        // ['Java', 'Python', 'Go', 'Java', 'java'], countOccurences('java', true) -> 1

        //For unit tests
        public class WordCounterTest {
            List<String> words = List.of("Java", "Python", "Go", "Java", "Java");
            WordCounter counter = new WordCounter(words);
  System.out.println(countOccurences("java", false));

        }*/
