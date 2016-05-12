package Praktikum4ADS;

class BinaryTreeNode implements IBinaryTreeNode<Integer, Integer> {
	private Integer key;
	private Integer value;
	private BinaryTreeNode leftchild;
	private BinaryTreeNode rightchild;

	public Integer getKey(){
		return this.key;
	}
	
	public void setKey(Integer key){
		this.key = key;
	}
	
	public Integer getValue(){
		return this.value;
	}
	
	public void setValue(Integer value){
		this.value=value;
	}
	
	public BinaryTreeNode getRightChild(){
		return rightchild;
	}
	
	public BinaryTreeNode getLeftChild(){
		return leftchild;
	}

	@Override
	public void setLeftChild(@SuppressWarnings("rawtypes") IBinaryTreeNode node) {
		this.leftchild = (BinaryTreeNode) node;
		
	}

	@Override
	public void setRightChild(@SuppressWarnings("rawtypes")IBinaryTreeNode node) {
		this.rightchild = (BinaryTreeNode) node;
		
	}
	
}
