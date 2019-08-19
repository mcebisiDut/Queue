class Main {
    private static final IQueueArray<Integer> queue = new QueueArray<Integer>();

    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println(queue.isEmpty());
        System.out.println("----------------------------------");
        String removed = getRemovedItem();
        System.out.println(removed);
        System.out.println("----------------------------------");
        String peeked = getPeekedItem();
        System.out.println(peeked);
        System.out.println("----------------------------------");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.display();
        System.out.println("----------------------------------");
        removed = getRemovedItem();
        System.out.println(removed);
        System.out.println("----------------------------------");
        queue.display();
        System.out.println("----------------------------------");
        peeked = getPeekedItem();
        System.out.println(peeked);
        System.out.println("----------------------------------");
        queue.add(4);
        queue.display();
        System.out.println("----------------------------------");
        queue.clear();
        queue.display();
        System.out.println("----------------------------------");
        System.out.println(queue.isEmpty());
    }

    private static String getRemovedItem() {
        String item;
        try {
            Integer value = queue.remove();
            item = Integer.toString(value);
        } catch (EmptyQueueException exception) {
            item = exception.getMessage();
        }

        return item;
    }

    private static String getPeekedItem() {
        String item;
        try {
            Integer value = queue.peek();
            item = Integer.toString(value);
        } catch (Exception exception) {
            item = exception.getMessage();
        }

        return item;
    }
}