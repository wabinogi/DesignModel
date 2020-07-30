package com.wabinogi.Visitor.Pet;

//具体访问者，专门访问属性
public class PetVisitor implements Visitable {

    Pet pet;

    @Override
    public void VisitPet(Pet pet) {
        this.pet = pet;
        ShowPetName();
        ShowPetFood();
        ShowPetAction();
        System.out.println("Price is : " + ShowPetPrice());
    }


    private void ShowPetName() {
        System.out.println("Name is : " + pet.name);
    }
    private void ShowPetFood() {
        System.out.println("Food is : " +pet.food);
    }

    private void ShowPetAction() {
        pet.Eat();
    }

    private int ShowPetPrice() {
        return pet.GetPrice();
    }
}
