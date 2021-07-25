package by.academy.othertasks.task1;

public class Phone {
    private String model;
    private int number;
    private int weight;

    public Phone(String model, int number, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        super();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name + getNumber());
    }

    public void receiveCall(String name, int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(number);
        System.out.println("Звонит " + sb.toString());
    }

    public void sendMessage(String name, int number, String message) {
        StringBuilder sb = new StringBuilder();
        sb.append(message).append(name).append(number);
        System.out.println("Вам отправлено сообщение : " + sb);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Phone phone = (Phone) obj;
        return model != null ? model.equals(phone.model) : phone.model == null
                && number == phone.number
                && weight == phone.weight;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result += result * prime * (model == null ? 0 : model.hashCode());
        result += result * prime + number;
        result += result * prime + weight;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Phone { ");
        sb.append("model : ").append(model);
        sb.append(" number : ").append(number);
        sb.append(" weight : ").append(weight);
        return sb.toString();
    }
}
