package org.neph.test;

import java.util.*;

/**
 * @ Author Nephat Muchiri
 * Date 16/07/2023
 */

public class Solution {
    public static class Results {
        public String set_name;
        public String[] cards;
    }

    public Results solution(String[] cards) {
        Results result = new Results();

        // Count the occurrences of each rank and suit
        Map<Character, Integer> rankCounts = new HashMap<>();
        Map<Character, Integer> suitCounts = new HashMap<>();
        for (String card : cards) {
            char rank = card.charAt(0);
            char suit = card.charAt(1);
            rankCounts.put(rank, rankCounts.getOrDefault(rank, 0) + 1);
            suitCounts.put(suit, suitCounts.getOrDefault(suit, 0) + 1);
        }

        // Check for each card set type in order of strength
        if (isSingleCard(rankCounts)) {
            result.set_name = "single card";
            result.cards = findCardsForSingleCard(rankCounts, cards);
        } else if (isPair(rankCounts)) {
            result.set_name = "pair";
            result.cards = findCardsForPair(rankCounts, cards);
        } else if (isTriple(rankCounts)) {
            result.set_name = "triple";
            result.cards = findCardsForTriple(rankCounts, cards);
        } else if (isFiveInARow(rankCounts)) {
            result.set_name = "five in a row";
            result.cards = findCardsForFiveInARow(rankCounts, cards);
        } else if (isSuit(suitCounts)) {
            result.set_name = "suit";
            result.cards = findCardsForSuit(suitCounts, cards);
        } else {
            result.set_name = "a triple and a pair";
            result.cards = findCardsForTripleAndPair(rankCounts, cards);
        }

        return result;
    }

    // Helper methods to check for each card set type
    private boolean isSingleCard(Map<Character, Integer> rankCounts) {
        return rankCounts.containsValue(1);
    }

    private boolean isPair(Map<Character, Integer> rankCounts) {
        return rankCounts.containsValue(2);
    }

    private boolean isTriple(Map<Character, Integer> rankCounts) {
        return rankCounts.containsValue(3);
    }

    private boolean isFiveInARow(Map<Character, Integer> rankCounts) {
        List<Character> ranks = new ArrayList<>(rankCounts.keySet());
        Collections.sort(ranks);
        for (int i = 0; i < ranks.size() - 4; i++) {
            if (ranks.get(i) + 4 == ranks.get(i + 4)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSuit(Map<Character, Integer> suitCounts) {
        return suitCounts.containsValue(5);
    }

    // Helper methods to find the cards for each card set type
    private String[] findCardsForSingleCard(Map<Character, Integer> rankCounts, String[] cards) {
        char highestRank = Collections.max(rankCounts.keySet());
        return new String[]{Character.toString(highestRank) + cards[0].charAt(1)};
    }

    private String[] findCardsForPair(Map<Character, Integer> rankCounts, String[] cards) {
        char highestRank = Collections.max(rankCounts.keySet());
        List<String> pairCards = new ArrayList<>();
        for (String card : cards) {
            if (card.charAt(0) == highestRank) {
                pairCards.add(card);
                if (pairCards.size() == 2) {
                    break;
                }
            }
        }
        return pairCards.toArray(new String[0]);
    }

    private String[] findCardsForTriple(Map<Character, Integer> rankCounts, String[] cards) {
        char highestRank = Collections.max(rankCounts.keySet());
        List<String> tripleCards = new ArrayList<>();
        for (String card : cards) {
            if (card.charAt(0) == highestRank) {
                tripleCards.add(card);
                if (tripleCards.size() == 3) {
                    break;
                }
            }
        }
        return tripleCards.toArray(new String[0]);
    }

    private String[] findCardsForFiveInARow(Map<Character, Integer> rankCounts, String[] cards) {
        List<String> fiveInARowCards = new ArrayList<>();
        List<Character> ranks = new ArrayList<>(rankCounts.keySet());
        Collections.sort(ranks);
        char highestRank = ranks.get(ranks.size() - 1);
        for (char rank = (char)(highestRank - 4); rank <= highestRank; rank++) {
            for (String card : cards) {
                if (card.charAt(0) == rank) {
                    fiveInARowCards.add(card);
                    break;
                }
            }
        }
        return fiveInARowCards.toArray(new String[0]);
    }

    private String[] findCardsForSuit(Map<Character, Integer> suitCounts, String[] cards) {
        char highestSuit = 'c'; // Lowest suit, to be updated if a higher suit is found
        for (char suit : suitCounts.keySet()) {
            if (suit > highestSuit) {
                highestSuit = suit;
            }
        }
        List<String> suitCards = new ArrayList<>();
        for (String card : cards) {
            if (card.charAt(1) == highestSuit) {
                suitCards.add(card);
            }
        }
        return suitCards.toArray(new String[0]);
    }

    private String[] findCardsForTripleAndPair(Map<Character, Integer> rankCounts, String[] cards) {
        char highestTripleRank = Collections.max(rankCounts.keySet());
        char highestPairRank = 0;
        for (char rank : rankCounts.keySet()) {
            if (rankCounts.get(rank) == 2 && rank > highestPairRank) {
                highestPairRank = rank;
            }
        }
        List<String> tripleAndPairCards = new ArrayList<>();
        for (String card : cards) {
            char rank = card.charAt(0);
            if (rank == highestTripleRank || rank == highestPairRank) {
                tripleAndPairCards.add(card);
            }
            if (tripleAndPairCards.size() == 5) {
                break;
            }
        }
        return tripleAndPairCards.toArray(new String[0]);
    }
}
