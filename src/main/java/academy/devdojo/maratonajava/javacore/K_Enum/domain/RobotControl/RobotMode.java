package academy.devdojo.maratonajava.javacore.K_Enum.domain.RobotControl;

    public enum RobotMode {
        CLEANING {
            @Override
            public void performTask() {
                System.out.println("The robot is cleaning the floor.");
            }
        },
        SECURITY {
            @Override
            public void performTask() {
                System.out.println("The robot is patrolling the area.");
            }
        },
        MAINTENANCE {
            @Override
            public void performTask() {
                System.out.println("The robot is performing self-maintenance.");
            }
        };

        public abstract void performTask();
    }


