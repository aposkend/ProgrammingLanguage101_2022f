import java.util.Scanner;

public class Main {
	
	public static String account = new String("0000");
	public static String password = new String("0000");
	private static int type = 0;
	private static int dishOrder = 0;
	private static String customerName = new String("");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		OrderList orderList = new OrderList();
		boolean flag = false;
		while(!flag) {
			String command =  sc.nextLine();
			switch(command) {
			case "customer":
				System.out.println("請輸入你的名字");
				customerName = sc.nextLine();
				break;
			case "menu":
				System.out.println("以下是菜單");
				menu.printMenu();
				break;
			case "order":
				if(o)
				System.out.println("添加至訂單中");
				
				break;
			case "admin":
				System.out.println("請輸入帳號密碼");
				if(sc.nextLine().equals(account)) {
					if(sc.nextLine().equals(password)) {
						System.out.println("登入成功");
						type = 1;
						break;
					}
					System.out.println("密碼錯誤");
				}
				System.out.println("帳號錯誤");
				break;
			case "addMenu":
				dishOrder++;
				String input = sc.nextLine();
				String[] inputs = input.split(" ");
				menu.addMenu(new Dish(inputs[0], dishOrder, Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
				System.out.println("成功添加新菜色");
				break;
			case "logout": 
				if(type == 1) {
					System.out.println("成功登出");
					type = 0;
					break;
				}
				System.out.println("未登入admin");
				customerName = "";
				break;
			case "help":
				if(type == 0) {
					System.out.println("customer");
				}
				if(type == 1) {
					System.out.println("admin");
				}
				break;
			default:
				System.out.println("未知的指令，用help查看指令");
			}
		}
	}

}
