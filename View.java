import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.util.ArrayList;

class View extends JPanel
{
	BufferedImage turtle_image, chair_image, lamp_image, lettuce_image, mushroom_image, outhouse_image, pillar_image, pond_image, robot_image, rock_image, statue_image, tree_image, skeleton_image, slime_image;
	Model model;
	ArrayList<BufferedImage> images = new ArrayList<BufferedImage>();

	View(Controller c, Model m)
	{
		// Link up to other objects
		c.setView(this);
		model = m;

		// Send mouse events to the controller
		this.addMouseListener(c);
		
		// Load the turtle image
		try
		{
			this.images.add(this.turtle_image = ImageIO.read(new File("images/turtle.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the chair image
		try
		{
			this.images.add(this.chair_image = ImageIO.read(new File("images/chair.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the lamp image
		try
		{
			this.images.add(this.lamp_image = ImageIO.read(new File("images/lamp.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the lettuce image
		try
		{
			this.images.add(this.lettuce_image = ImageIO.read(new File("images/lettuce.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the mushroom image
		try
		{
			this.images.add(this.mushroom_image = ImageIO.read(new File("images/mushroom.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the outhouse image
		try
		{
			this.images.add(this.outhouse_image = ImageIO.read(new File("images/outhouse.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the pillar image
		try
		{
			this.images.add(this.pillar_image = ImageIO.read(new File("images/pillar.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the pond image
		try
		{
			this.images.add(this.pond_image = ImageIO.read(new File("images/pond.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the robot image
		try
		{
			this.images.add(this.robot_image = ImageIO.read(new File("images/robot.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the rock image
		try
		{
			this.images.add(this.rock_image = ImageIO.read(new File("images/rock.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the statue image
		try
		{
			this.images.add(this.statue_image = ImageIO.read(new File("images/statue.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the tree image
		try
		{
			this.images.add(this.tree_image = ImageIO.read(new File("images/tree.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the skeleton image
		try
		{
			this.images.add(this.skeleton_image = ImageIO.read(new File("images/skeleton.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// Load the slime image
		try
		{
			this.images.add(this.slime_image = ImageIO.read(new File("images/slime.png")));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		
	}

	public void paintComponent(Graphics g)
	{
		int w = this.images.get(model.imageTracker).getWidth();
		int h = this.images.get(model.imageTracker).getHeight();
		// Clear the background
		g.setColor(new Color(96, 107, 19));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		// Draw square in corner
		g.setColor(new Color(153, 0, 191));
		g.fillRect(0, 0, 200, 200);
		g.drawImage(this.images.get(model.imageTracker), 100 - w / 2, 100 - h / 2, null);
		
		for (int i = 0; i < model.things.size(); i++)
		{
			g.drawImage(this.images.get(model.things.get(i).kind), model.things.get(i).x - this.images.get(model.things.get(i).kind).getWidth()/2, model.things.get(i).y - this.images.get(model.things.get(i).kind).getHeight()/2, null);
		}
	}
}
