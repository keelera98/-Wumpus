
    public class BoundaryTile extends Tile {

        public BoundaryTile(int id) {
            super(Asset.boundary, id);
        }

        @Override
        public boolean isSolid(){
            return true;
        }

    }

