package commandpattern;

/*
 * The Command pattern encapsulates a request as an object, thereby letting you
 * parameterize other objects with different requests, queue or log requests,
 * and support undoable operations.
 * This pattern encapsulates a request by binding together a set of actions on the
 * receiver, it packages them into one object and exposes just method execute().
 * Other actions do not know what actions are called on the receiver.
 * 
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand command = new LightOnCommand(light);
		remote.setCommand(command);
		remote.buttonWasPressed();
	}
}
