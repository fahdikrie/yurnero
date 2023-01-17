def unique_in_order(sequence):
    unique_elements = []
    current_element = None

    for char in sequence:
        if (current_element != char):
            unique_elements.append(char)

        current_element = char

    return unique_elements