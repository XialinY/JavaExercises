package at.technikum.Vorlesung4;

import java.util.Scanner;

public class ColorFunctions {

    /*------------ DO NOT TOUCH ----------------*/
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Test[] tests = {new Test() {
            @Override
            protected void exec() {
                welcome();

            }


        }, new Test() {
            @Override

            protected void exec() {
                good_bye();

            }

        }, new Test() {
            @Override
            protected void exec() {
                System.out.printf("%d\n", read_channel());
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a, b, c;
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                System.out.printf("%d\n", encode(a, b, c));

            }

        }, new Test() {
            @Override
            protected void exec() {
                System.out.printf("%d\n", read_rgb());
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                // scanf("%d", &a);
                a = sc.nextInt();
                System.out.printf("%d\n", red(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", green(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", blue(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();

                print_rgb(a);

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", rgb_2_cmy(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", cyan(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", magenta(a));

            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                System.out.printf("%d\n", yellow(a));
            }

        }, new Test() {
            @Override
            protected void exec() {
                int a;
                a = sc.nextInt();
                print_cmy(a);

            }

        }, new Test() {
            @Override
            protected void exec() {
                convert();

            }
        }
        };
        System.out.printf("Test#: ");
        int n = sc.nextInt();
        if (n < 1 || n > tests.length + 1) {
            System.out.println("unknown test.");
            return;
        }
        tests[n - 1].run();
        sc.close();
    }

    private abstract static class Test {
        protected abstract void exec();

        void run() {
            System.out.printf("executing %s\n", this.getClass().getSimpleName());
            exec();
        }
    }
    public static void welcome() {
        System.out.println("Welcome to ColorFunctions");
    }

    public static void good_bye() {
        System.out.print("\nExiting ColorFunctions");
    }

    public static int read_channel() {
        System.out.print(":");
        int input = sc.nextInt();

        while (input < 0 || input > 255) {
            System.out.print(":");
            input = sc.nextInt();
        }
        return input;
    }

    public static int encode(int c1, int c2, int c3) {
        int sum = c1 * 1000000 + c2 * 1000 + c3;
        return sum;
    }

    public static int read_rgb() {

        System.out.print("red");
        int red = read_channel();
        System.out.print("green");
        int green = read_channel();
        System.out.print("blue");
        int blue = read_channel();

        return encode(red, green, blue);
    }

    public static int red(int rgb) {
        return (rgb / 1000000);
    }

    public static int green(int rgb) {
        return (rgb / 1000 % 1000);
    }

    public static int blue(int rgb) {
        return (rgb % 1000);
    }

    public static void print_rgb(int rgb) {
        System.out.printf("\nR%03d G%03d B%03d", red(rgb), green(rgb), blue(rgb));
    }

    public static int rgb_2_cmy(int rgb) {
        return (255255255 - rgb);
    }

    public static int cyan(int cmy) {
        return (cmy / 1000000);
    }

    public static int magenta(int cmy) {
        return (cmy / 1000 % 1000);
    }

    public static int yellow(int cmy) {
        return (cmy % 1000);
    }

    public static void print_cmy(int cmy) {
        System.out.printf("\nC%03d M%03d Y%03d", cyan(cmy), magenta(cmy), yellow(cmy));
    }

    public static void convert() {
        welcome();
        int rgb = read_rgb();
        print_rgb(rgb);
        print_cmy(rgb_2_cmy(rgb));
        good_bye();
    }
}