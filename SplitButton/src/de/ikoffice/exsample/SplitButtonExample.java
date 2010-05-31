package de.ikoffice.exsample;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import de.ikoffice.widgets.SplitButton;

public class SplitButtonExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell (display);
		shell.setSize(300, 300);
		shell.setLayout(new FormLayout());
		SplitButton ok = new SplitButton (shell, SWT.NONE);
		ok.setText ("Actions");
		FormData fd = new FormData();
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	}

}
