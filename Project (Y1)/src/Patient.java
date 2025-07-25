class Patient {
    static int[] a;
    static int x;
    private static String doctorProfile;
    private static String findDepartment() {
        String j;
        for (j = String.valueOf(0);;) {
            if (a[Integer.parseInt(j)] == x) {
                return j;
            }
            System.out.println("The department is:" + j);
        }
    }
    public static String findDoctorID() {
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println("The doctor's profile is:" + doctorProfile);
                return String.valueOf(i);
            }
            class doctorProfile {
                private final User user = new User();
                public doctorProfile() {
                    System.out.println("Enter the first name:");
                    System.out.println("Enter the last name:");
                    System.out.println("Enter the username:");
                    System.out.println("Enter your password:");
                }

                public User getUser() {
                    return user;
                }

                class User {

                }
            }
        }
        return doctorProfile;
    }

    public static void setDoctorProfile(String doctorProfile) {
        Patient.doctorProfile = doctorProfile;
    }
}


