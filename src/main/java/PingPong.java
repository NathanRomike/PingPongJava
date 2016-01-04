public class PingPong {
  public static void main(String[] args) {}

  public String decision(Integer number) {
    if ( number % 15 == 0){
      return "pingpong";
    }else if ( number % 3 == 0 ){
      return "ping";
    } else if (number % 5 == 0){
      return "pong";
    } else {
      return String.valueOf(number);
    }

  }
}
