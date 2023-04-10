public class Notebook {
    private String Name;
    private String Ram;
    private String HardDisk;
    private String OS;
    private String color;
    
    public Notebook(String Name, String Ram, String HardDisk, String OS, String color) {
        this.Name = Name;
        this.Ram = Ram;
        this.HardDisk = HardDisk;
        this.OS = OS;
        this.color = color;
    }

    public String getName() {
        return Name;
    }

    public String getRam() {
        return Ram;
    }

    public String getHardDisk() {
        return HardDisk;
    }

    
    public String getOperatingSystem() {
        return OS;
    }

    
    public String getColour() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook [Name=" + Name + ", Ram=" + Ram + ", HardDisk=" + HardDisk + ", OS="
                + OS + ", color=" + color + "]";
    }


  
    
    
}
