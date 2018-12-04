package net.chandol.ladder.v2.domain;

import net.chandol.ladder.v2.domain.line.Lines;
import net.chandol.ladder.v2.domain.line.LinesGenerator;
import net.chandol.ladder.v2.domain.player.Players;

public class Ladder {
    private Lines lines;
    private Players players;

    public Ladder(Players players, int height, LinesGenerator linesGenerator) {
        this.players = players;
        this.lines = linesGenerator.generate(players.size(), height);
    }

    public boolean hasPoint(int column, int row) {
        return lines.hasPoint(column, row);
    }

    public String createLadderString() {
        String playersStr = players.createPlayersString();
        String linesStr = String.join("\n", lines.createLinesString());

        return playersStr + "\n" + linesStr;
    }
}
