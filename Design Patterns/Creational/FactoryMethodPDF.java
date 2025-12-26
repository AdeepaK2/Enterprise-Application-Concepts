class Main{
    public static void main(String[] args) {
        File newFile = FileFactory.getFile("PDF");
        String data= newFile.display();
    }
}


interface File{
    String display();
    void print();
}

class PDF implements File {
    public String display(){
       return "This is a PDF document.";
    }
    public void print(){
        System.out.println("Printing PDF document.");
    }
}


class Word implements File {
    public String display(){
        return "This is a Word document.";
    }
    public void print(){
        System.out.println("Printing Word document.");
    }
}

class FileFactory{
    public static File getFile(String fileType){
      if(fileType=="PDF"){
          return new PDF();
      } else if(fileType=="Word"){
          return new Word();
      }
      return null;
    }
}