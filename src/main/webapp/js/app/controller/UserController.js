Ext.define('AM.controller.UserController', {
    extend: 'Ext.app.Controller',

    init: function() {
      this.control({
          'viewport > panel': {
              render: this.onPanelRendered
          }
      });
  },
  views: [
      'user.List'
  ],

  onPanelRendered: function() {
      console.log('The panel was rendered');
  }

});
