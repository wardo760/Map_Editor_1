import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class Controller implements MouseListener, KeyListener
{
	View view;
	Model model;

	Controller(Model m)
	{
		model = m;
	}

	void setView(View v)
	{
		view = v;
	}

	public void mousePressed(MouseEvent e)
	{
		if(e.getX() < 200 && e.getY() < 200)
		{
			model.imageTracker++;
			if(model.imageTracker > view.images.size() - 1)
			{
				model.imageTracker = 0;
			}
		}
		else
		{
			if(e.getButton() == 1)
			{
				model.addThing(e.getX(), e.getY());
			}

			if(e.getButton() == 3)
			{
				model.removeThing(e.getX(), e.getY());
			}
		}
		
	}

	public void mouseReleased(MouseEvent e) 
	{	}
	
	public void mouseEntered(MouseEvent e) 
	{	}
	
	public void mouseExited(MouseEvent e) 
	{	}
	
	public void mouseClicked(MouseEvent e) 
	{	}

	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{	}
	}

	public void keyReleased(KeyEvent e)
	{

		switch(e.getKeyCode())
		{
			case KeyEvent.VK_ESCAPE:
				System.exit(0);
		}
		char c = Character.toLowerCase(e.getKeyChar());
		if(c == 'q')
			System.exit(0);
        if(c == 'r')
            model.reset();
	}

	public void keyTyped(KeyEvent e)
	{	}

	void update()
	{	}
}
