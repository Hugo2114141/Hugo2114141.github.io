$(document).ready(function() {
  $(".dropdown").hover(
    function() {
      $('.dropdown-content', this).stop( true, true ).slideDown("fast");
      $(this).toggleClass('open');
    },
    function() {
      $('.dropdown-content', this).stop( true, true ).slideUp("fast");
      $(this).toggleClass('open');
    }
  );
});