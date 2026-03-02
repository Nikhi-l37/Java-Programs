int currentCount;

if (counts.containsKey(num)) {
    // If the number is already in the map, get its value
    currentCount = counts.get(num);
} else {
    // If it's the first time seeing it, start at 0
    currentCount = 0;
}

// Add 1 and put it back in the map
counts.put(num, currentCount + 1);
