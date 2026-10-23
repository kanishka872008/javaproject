import java.util.concurrent.locks.ReentrantLock;

class  deadlockInternship {

    static ReentrantLock studentLock = new ReentrantLock();
    static ReentrantLock companyLock = new ReentrantLock();

    static void studentApplication() {
        boolean studentAcquired = false;
        boolean companyAcquired = false;

        try {
            studentAcquired = studentLock.tryLock();

            if (studentAcquired) {
                System.out.println("Student: Student details locked");

                companyAcquired = companyLock.tryLock();

                if (companyAcquired) {
                    System.out.println("Student: Company details accessed");
                } else {
                    System.out.println("Student: Company busy, try again later");
                }
            }
        } finally {
            if (companyAcquired) {
                companyLock.unlock();
            }
            if (studentAcquired) {
                studentLock.unlock();
            }
        }
    }

    static void companyReview() {
        boolean companyAcquired = false;
        boolean studentAcquired = false;

        try {
            companyAcquired = companyLock.tryLock();

            if (companyAcquired) {
                System.out.println("Company: Company details locked");

                studentAcquired = studentLock.tryLock();

                if (studentAcquired) {
                    System.out.println("Company: Student details accessed");
                } else {
                    System.out.println("Company: Student busy, try again later");
                }
            }
        } finally {
            if (studentAcquired) {
                studentLock.unlock();
            }
            if (companyAcquired) {
                companyLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
          Runnable studentTask = new Runnable() {
            public void run() {
                studentApplication();
            }
        };

        Runnable companyTask = new Runnable() {
            public void run() {
                companyReview();
            }
        };

        Thread t1 = new Thread(studentTask);
        Thread t2 = new Thread(companyTask);

        t1.start();
        t2.start();
    }
}