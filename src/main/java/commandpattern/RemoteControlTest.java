package commandpattern;

/*
 * The Command pattern encapsulates a request as an object, thereby letting you
 * parameterize other objects with different requests, queue or log requests,
 * and support undoable operations.
 * This pattern encapsulates a request by binding together a set of actions on the
 * receiver, it packages them into one object and exposes just method execute().
 * Other actions do not know what actions are called on the receiver.
 * Invokers can be parameterized with Commands even dynamically at runtime.
 *
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand command = new LightOnCommand(light);
		remote.setCommand(command);
		remote.buttonWasPressed();

		RemoteControl remoteControl = new RemoteControl();
		Light light1 = new Light();
		Stereo stereo = new Stereo();
		remoteControl.setCommand(0, new LightOnCommand(light1), new LightOffCommand(light1));
		remoteControl.setCommand(1, new StereoOnCommand(stereo), new StereoOffCommand(stereo));
        System.out.println(remoteControl.toString());
		remoteControl.offButtonWasPushed(1);
	}
}
