package softwareengineeringtemplate;

import softwareengineeringtemplate.ui.SwEnUI;

public class softwareengineeringtemplate {

    public static void main(String[] args) {
        
        /*
        
        //Test area. Only use for debugging. Comment when done to allow for proper functioning of the program.
        
        ClothesDeposit cd = new ClothesDeposit();
        
        Clothes c1 = new Shoes("Adidas", "Superstar LGBT sneakers", "Street-style", "Multiple colours", "Synthetic leather", "Low-top", 10, 80.52);
        
        Clothes c2 = new Tops("Calvin Klein", "Red and black CK t-shirt", "Casual", "White, red and black", "100% cotton", "T-shirt", "Athletic fit", 3, 42.75);
        
        Clothes c3 = new Bottoms("Levi's", "Dark blue denim jeans", "Casual", "Dark blue", "100% cotton", "Non-distressed denim jeans", "Slim-fit", 21, 60.33);
        
        cd.addItem(c1);
        cd.addItem(c2);
        cd.addItem(c3);
        
        MinHeap mh = new MinHeap(cd.getNoOfClothes(), cd.getClothesDeposit());
        
        System.out.println("Min Heap:");
        System.out.println(mh.extractMin().getBrand());
        System.out.println("");
        System.out.println(mh.extractMin().getBrand());
        System.out.println("");
        System.out.println(mh.extractMin().getBrand());
        
        MaxHeap maxH = new MaxHeap(cd.getNoOfClothes(), cd.getClothesDeposit());
        
        System.out.println("Max Heap:");
        System.out.println(maxH.extractMax().getBrand());
        System.out.println("");
        System.out.println(maxH.extractMax().getBrand());
        System.out.println("");
        System.out.println(maxH.extractMax().getBrand());

        */
        
        new SwEnUI().setVisible(true);
    } 
}
