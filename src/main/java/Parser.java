public class Parser {
    private enum Type {
        todo,
        deadline,
        mark,
        unmark,
        list,
        bye,
        delete,
        event;
    }

    public static Command parse(String input) throws IllegalArgumentException {
        String[] input2 = input.split(" ");
        Type t = Type.valueOf(input2[0].toLowerCase());
        switch(t) {
            case todo:
                return new TodoCommand(input2[1]);

            case deadline:
                return new DeadlineCommand(input);

            case mark:
                return new MarkCommand(input2[1]);

            case unmark:
                return new UnmarkCommand(input2[1]);

            case list:
                return new ListCommand();

            case bye:
                return new ByeCommand();

            case delete:
                return new DeleteCommand(input2[1]);

            case event:
                return new EventCommand(input);

            default:
                throw new IllegalArgumentException();
        }
    }
}