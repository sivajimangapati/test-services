public class FoodFactory {

	public Food getFood(String order) {
		if ("FastFood".equals(order)) {
			return new FastFood();
		} else if ("Fruit".equals(order)) {
			return new Fruit();
		}
		return null;
	}
	
}
