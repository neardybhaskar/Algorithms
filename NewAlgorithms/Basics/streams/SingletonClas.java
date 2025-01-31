public class SingletonClas {

    private static SingletonClas singletonClas = null;

    private SingletonClas() {

    }

    public static SingletonClas getInstance() {
        if(singletonClas == null) {
            synchronized (SingletonClas.class) {
                return new SingletonClas();
            }

        } else {
            return singletonClas;
        }
    }

    public static void main(String[] args) {
        SingletonClas singletonClas1 = SingletonClas.getInstance();
    }

    /*select name from employee order by asc Limit 1 where salary = (
            select salary from epmployee order by salary Desc Limit 3)

    select count(d.deparmentid) name from employee e inner join department d on d.employeeid = e.id
    group by e.id, d.employeeid*/



}
