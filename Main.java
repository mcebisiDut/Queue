class Main {
    private static final IQueueArray<Integer> myQueue = new QueueArray<Integer>();

    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println(myQueue.isEmpty());
        System.out.println("----------------------------------");
        String removed = getRemovedItem();
        System.out.println(removed);
        System.out.println("----------------------------------");
        String peeked = getPeekedItem();
        System.out.println(peeked);
        System.out.println("----------------------------------");
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.display();
        System.out.println("----------------------------------");
        removed = getRemovedItem();
        System.out.println(removed);
        System.out.println("----------------------------------");
        myQueue.display();
        System.out.println("----------------------------------");
        peeked = getPeekedItem();
        System.out.println(peeked);
        System.out.println("----------------------------------");
        myQueue.add(4);
        myQueue.display();
        System.out.println("----------------------------------");
        myQueue.clear();
        myQueue.display();
        System.out.println("----------------------------------");
    }

    private static String getRemovedItem() {
        String item;
        try {
            Integer value = myQueue.remove();
            item = Integer.toString(value);
        } catch (EmptyQueueException exception) {
            item = exception.getMessage();
        }

        return item;
    }

    private static String getPeekedItem() {
        String item;
        try {
            Integer value = myQueue.peek();
            item = Integer.toString(value);
        } catch (Exception exception) {
            item = exception.getMessage();
        }

        return item;
    }
}