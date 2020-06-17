/**
 * 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
 * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
 * <p>
 * 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
 * участники должны выполнять соответствующие действия (бежать или прыгать),
 * результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
 * <p>
 * 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
 * <p>
 * 4. (*) У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 * Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */


package lesson1;

import java.util.Random;

public class Lesson1 {

    private static final Random rnd = new Random();

    static int humV = 1; // Кол-во Людей
    static int catV = 1; // Кол-во Котов
    static int robV = 1; // Кол-во Роботов
    static int obstacle = 3; // Кол-во Стен


    static Human[] human = new Human[humV];
    static Cat[] cat = new Cat[catV];
    static Robot[] robot = new Robot[robV];
    static Wall[] wall = new Wall[obstacle];
    static Track[] track = new Track[obstacle];


    //Создаем людей
    public static void makeHumans() {
        for (int i = 0; i < humV; i++) {
            human[i] = new Human("Jack.#" + i);
            System.out.println("Human created: " + human[i].getName());

        }
    }

    public static void makeCats() {
        for (int i = 0; i < catV; i++) {
            cat[i] = new Cat("Murzik.#" + i);
            System.out.println("Cat created: " + cat[i].getName());

        }
    }

    public static void makeRobots() {
        for (int i = 0; i < robV; i++) {
            robot[i] = new Robot("Robot.#" + i);
            System.out.println("Robot created: " + robot[i].getName());

        }
    }

    public static void makeTracks() {
        for (int i = 0; i < obstacle; i++) {
            track[i] = new Track(rnd.nextInt(50));
            System.out.println("Track created: " + track[i].getDistance());
        }
    }

    public static void makeWalls() {
        for (int i = 0; i < obstacle; i++) {
            wall[i] = new Wall(rnd.nextInt(5));
            System.out.println("Wall created: " + wall[i].getHeight());
        }
    }

    public static void checkerHuman() {
        for (int i = 0; i < humV; i++) {
            System.out.println("===============================================================");
            int place = 0;
            human[i].maxWallValue = 0;
            human[i].maxTrackValue = 0;

            for (int j = 0; j < obstacle; j++) {
                human[i].maxWallValue = wall[j].getHeight();
                human[i].maxTrackValue = track[j].getDistance();
                if (human[i].canJump()) {
                    if (human[i].canRun()) {
                        place++;
                    } else break;
                } else break;
            }
            if (place == obstacle) {
                System.out.println("Good finish! Passed through all obstacles!");
            } else {
                System.out.println("Unlucky, try next time :< ");
            }
        }
    }

    public static void checkerCat() {
        for (int i = 0; i < catV; i++) {
            System.out.println("===============================================================");
            int place = 0;
            cat[i].maxWallValue = 0;
            cat[i].maxTrackValue = 0;
            for (int j = 0; j < obstacle; j++) {
                cat[i].maxWallValue = wall[j].getHeight();
                cat[i].maxTrackValue = track[j].getDistance();
                if (cat[i].canJump()) {
                    if (cat[i].canRun()) {
                        place++;
                    } else break;
                } else break;
            }
            if (place == obstacle) {
                System.out.println("Good finish! Passed through all obstacles!");
            } else {
                System.out.println("Unlucky, try next time :< ");
            }
        }
    }

    public static void checkerRobot() {
        for (int i = 0; i < robV; i++) {
            System.out.println("===============================================================");
            int place = 0;
            robot[i].maxWallValue = 0;
            robot[i].maxTrackValue = 0;
            for (int j = 0; j < obstacle; j++) {
                robot[i].maxWallValue = wall[j].getHeight();
                robot[i].maxTrackValue = track[j].getDistance();
                if (robot[i].canJump()) {
                    if (robot[i].canRun()) {
                        place++;
                    } else break;
                } else break;
            }
            if (place == obstacle) {
                System.out.println("Good finish! Passed through all obstacles!");
            } else {
                System.out.println("Unlucky, try next time :< ");
            }
        }
    }


    public static void main(String[] args) {

        //Создаем массивы людей, котов, роботов, стен и дорожек
        makeHumans();
        makeCats();
        makeRobots();
        makeWalls();
        makeTracks();
        human[0].info();
        cat[0].info();
        robot[0].info();

        //Проверяем сможет ли преодолеть %конкурсант% полосу препятствий
        checkerHuman();
        checkerCat();
        checkerRobot();

    }
}





