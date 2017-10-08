


import java.io.Serializable;
    public class DataBean implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name = null;
        private String occupation = null;
        private int age = 0;
        private int workingHours = 0;
        public DataBean() {
        }
        public String getName() {
            return name;
        }
        public String getOccupation() {
            return occupation;
        }
        public int getAge() {
            return age;
        }
        public int getWorkingHours() {
            return workingHours;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setWorkingHours(int workingHours) {
            this.workingHours = workingHours;
        }
    }

