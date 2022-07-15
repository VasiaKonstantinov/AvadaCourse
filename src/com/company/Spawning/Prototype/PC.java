package com.company.Spawning.Prototype;

public class PC implements Copyable
{
    private String VideoCard;
    private int RAM;
    private int price;

    public PC(String videoCard, int RAM, int price) {
        VideoCard = videoCard;
        this.RAM = RAM;
        this.price = price;
    }

    public String getVideoCard() {
        return VideoCard;
    }

    public void setVideoCard(String videoCard) {
        VideoCard = videoCard;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public Object copy()
    {
        PC copy = new PC(VideoCard,RAM,price);
        return copy;
    }

    @Override
    public String toString() {
        return "PC{" +
                "VideoCard='" + VideoCard + '\'' +
                ", RAM=" + RAM +
                ", price=" + price +
                '}';
    }
}
