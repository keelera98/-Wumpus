
    public class RockTile extends Tile {

        public RockTile(int id) {
            super(Asset.rock, id);
        }

        @Override
        public boolean isSolid(){
            return false;
        }

    }

