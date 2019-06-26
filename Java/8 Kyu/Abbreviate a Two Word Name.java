public class AbbreviateTwoWords {
  public static String abbrevName(String name) {
    return name.toUpperCase().split(" ")[0].split("")[0]+"."+name.toUpperCase().split(" ")[1].split("")[0];
  }
}