
// open a single window
var win = Ti.UI.createWindow({
	backgroundColor:'white'
});
var label = Ti.UI.createLabel();
win.add(label);
win.open();




if (Ti.Platform.name == "android") {

		var clipview = require('de.marcbender.clipview');

		// similar feature as in iOS views with  clipMode = Titanium.UI.iOS.CLIP_MODE_DISABLED
		// samme options as for Ti.UI.createView() possible
		var nonClippingView = clipview.createClipView();
		win.add(nonClippingView);

}

