    package academy.devdojo.maratonajava.javacore.G_Association.domain;

    public class Robot {
        public String name;
        public Supervisor supervisor;

        public void info(){
            System.out.println("______________________________________________________");
            System.out.println("Robot " + this.name + " is supervisedy by " + this.supervisor.getName());
        }
        public Robot(String name, Supervisor supervisor) {
            this.name = name;
            this.supervisor = supervisor;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Supervisor getSupervisor() {
            return supervisor;
        }

        public void setSupervisor(Supervisor supervisor) {
            this.supervisor = supervisor;
        }
    }




