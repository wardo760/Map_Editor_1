import java.util.ArrayList;

class Thing
{
	public int x;
	public int y;
	public int kind;

	Thing(int x, int y, int kind)
	{
		this.x = x;
		this.y = y;
		this.kind = kind;
	}
}

class Model
{
	ArrayList<Thing> things;
	int imageTracker;

	Model()
	{
		this.imageTracker = 0;
		this.things = new ArrayList<Thing>();
	}

	public void addThing(int x, int y)
	{
		things.add(new Thing(x, y, this.imageTracker));
	}

	public void removeThing(int x, int y)
	{
		int tempIndex = -1;
		double smallest = 100000000000.0;
		double tempDistance = -1.0;
		for (int i = 0; i < things.size(); i++)
		{
			tempDistance = Math.sqrt(Math.pow(things.get(i).x - x, 2) + Math.pow(things.get(i).y - y , 2));
			if(tempDistance < smallest)
			{
				smallest = tempDistance;
				tempDistance = -1.0;
				tempIndex = i;
			}
		}
		if(tempIndex != -1)
		{
			things.remove(tempIndex);
		}
	}

	public void update()
	{	}

    public void reset()
    {
		things.clear();
    }

	public void setDestination(int x, int y)
	{	}
}