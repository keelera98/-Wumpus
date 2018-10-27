
    public class GameCamera {
        private float xOffset, yOffset;
        private Game game;
        public GameCamera(Game game, float xOffset, float yOffset){
            //the offset moves the tiles depending on what the offset is
            this.xOffset = xOffset;
            this.yOffset = yOffset;
            this.game = game;
        }

        //takes in how much the x and y should be offset
        public void move(float xAmt, float yAmt){
            xOffset += xAmt;
            yOffset += yAmt;
        }

        //this centers the entity on the screen
        public void centerOnEntity(Entity e){
            //this directly centers the player
            xOffset = e.getX() - game.getWidth() / 2 + e.getWidth() / 2;
            yOffset = e.getY() - game.getHeight() / 2 + e.getHeight() / 2;
        }

        public float getxOffset() {
            return xOffset;
        }

        public void setxOffset(float xOffset) {
            this.xOffset = xOffset;
        }

        public float getyOffset() {
            return yOffset;
        }

        public void setyOffset(float yOffset) {
            this.yOffset = yOffset;
        }
    }

