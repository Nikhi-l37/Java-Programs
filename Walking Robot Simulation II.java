class Robot {
    private int width, height, perimeter;
    private int pos = 0;
    private boolean hasMoved = false;

    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
        this.perimeter = 2 * (width + height - 2);
    }

    public void step(int num) {
        hasMoved = true;
        pos = (pos + num) % perimeter;
    }

    public int[] getPos() {
        if (pos < width) return new int[]{pos, 0}; // Bottom edge
        if (pos < width + height - 1) return new int[]{width - 1, pos - (width - 1)}; // Right edge
        if (pos < 2 * width + height - 2) return new int[]{width - 1 - (pos - (width + height - 2)), height - 1}; // Top edge
        return new int[]{0, height - 1 - (pos - (2 * width + height - 3))}; // Left edge
    }

    public String getDir() {
        // If we haven't moved yet, it's always East.
        if (!hasMoved) return "East";
        
        // If we land back at 0 after moving, it's South (last turn of the lap).
        if (pos == 0) return "South";
        
        if (pos < width) return "East";
        if (pos < width + height - 1) return "North";
        if (pos < 2 * width + height - 2) return "West";
        return "South";
    }
}
