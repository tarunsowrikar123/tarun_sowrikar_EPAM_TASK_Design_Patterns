public class NameRepository implements Container {
	public String names[] = { "Emma Watson","Jennifer","Emma Stone","Isabella"};
	
	@Override
	public Iterator getInterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {

		int index;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			
			return index<names.length;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
		
	}
}