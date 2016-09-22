package shildt.aboutMath.Math1;

public class Angles {
    public static void main(String[] args) {
        double theta = 120.0;

        System.out.println(
                        theta + " degrees equals " +
                        Math.toRadians(theta) + " radians."
        );
        theta = 1.312;
        System.out.println(
                    theta + " radians equals " +
                    Math.toDegrees(theta) + " degrees."
        );
    }
}
