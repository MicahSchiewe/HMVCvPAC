package edu.baylor.cs5352.hmvc;

import java.util.List;

import edu.baylor.cs5352.hmvc.input.InputController;
import edu.baylor.cs5352.hmvc.input.InputView;
import edu.baylor.cs5352.hmvc.output.OutputController;
import edu.baylor.cs5352.hmvc.output.OutputModel;
import edu.baylor.cs5352.hmvc.output.OutputView;
import edu.baylor.cs5352.hmvc.window.WindowController;
import edu.baylor.cs5352.hmvc.window.WindowModel;
import edu.baylor.cs5352.hmvc.window.WindowView;

public class HMVC_KWIC {
	public static void main(String[] args) {
		// Output
		var oC = new OutputController();
		var out = new OutputView(oC, null);
		var oM = new OutputModel(out);
		out.setModel(oM);
		oC.setModel(oM);

		// Input
		var iC = new InputController();
		var in = new InputView(iC);
		var iM = new OutputModel(out);
		in.setModel(iM);
		iC.setModel(iM);

		// Window
		var wC = new WindowController();
		var win = new WindowView(wC);
		var wM = new WindowModel(win);
		win.setModel(wM);
		wC.setModel(wM);

		// Wire and show
		win.addToRoot(in);
		win.addToRoot(out);
		wC.setChildren(List.of(iC, oC));
		iC.setParent(wC);
		oC.setParent(wC);
		win.showWindow();
	}
}
