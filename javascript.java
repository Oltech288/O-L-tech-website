// Wait for the DOM to be fully loaded
document.addEventListener('DOMContentLoaded', function () {
    // Get the form element
    const form = document.getElementById('contactForm');

    // Add submit event listener to the form
    form.addEventListener('submit', function (event) {
        // Prevent the default form submission
        event.preventDefault();

        // Validate the form
        if (validateForm()) {
            // If valid, simulate form submission (you can replace this with actual form submission logic)
            alert('Form submitted successfully!'); // Replace with your actual submission code
            form.reset(); // Optionally reset the form after submission
        }
    });

    // Function to validate form fields
    function validateForm() {
        // Get form fields
        const name = document.getElementById('name').value.trim();
        const email = document.getElementById('email').value.trim();
        const message = document.getElementById('message').value.trim();

        // Simple validation: Check if all fields are filled out
        if (name === '' || email === '' || message === '') {
            alert('Please fill out all fields.');
            return false;
        }

        // Additional validation logic can be added here (e.g., email format validation)

        return true; // Form is valid
    }
});
