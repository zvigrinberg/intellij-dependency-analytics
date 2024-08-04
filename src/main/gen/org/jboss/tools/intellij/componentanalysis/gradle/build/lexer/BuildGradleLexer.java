// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: buildGradle.flex

package org.jboss.tools.intellij.componentanalysis.gradle.build.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static org.jboss.tools.intellij.componentanalysis.gradle.build.psi.BuildGradleTypes.*;


public class BuildGradleLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING_DEPENDENCY = 2;
  public static final int HANDLE_DEPENDENCIES = 4;
  public static final int MAP_DEPENDENCY = 6;
  public static final int HANDLE_GROUP = 8;
  public static final int HANDLE_ARTIFACT = 10;
  public static final int HANDLE_VERSION = 12;
  public static final int EXTRACT_GROUP_STRING = 14;
  public static final int EXTRACT_ARTIFACT_STRING = 16;
  public static final int EXTRACT_VERSION_STRING = 18;
  public static final int GET_ROOT_VALUES = 20;
  public static final int GET_GENERIC_VALUES = 22;
  public static final int BYPASS_UNNECESSARY_BLOCK = 24;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\25\u0100\1\u0200\11\u0100\1\u0300\17\u0100\1\u0400\247\u0100"+
    "\10\u0500\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\0"+
    "\1\4\4\0\1\5\1\6\1\7\2\0\1\10\1\11"+
    "\1\12\1\13\12\14\1\15\2\0\1\16\3\0\2\11"+
    "\1\17\2\11\1\20\2\11\1\21\5\11\1\22\1\23"+
    "\2\11\1\24\1\25\1\26\1\27\3\11\1\30\1\31"+
    "\1\32\1\33\1\0\1\34\1\0\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\11\1\55\1\56"+
    "\1\57\1\60\1\61\1\11\1\62\1\63\1\11\1\64"+
    "\1\65\1\66\7\0\1\3\32\0\1\1\u01df\0\1\1"+
    "\177\0\13\1\35\0\2\3\5\0\1\1\57\0\1\1"+
    "\240\0\1\1\377\0\u0100\67";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\15\0\1\1\1\2\1\3\1\4\1\5\14\1\1\6"+
    "\1\7\1\10\1\2\1\11\1\12\1\13\1\14\2\10"+
    "\1\15\1\2\1\16\5\0\1\17\1\20\5\10\1\2"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\1"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\0\1\42\22\0\1\43\1\44\6\0"+
    "\1\45\6\0\1\46\21\0\1\47\1\50\7\0\1\51"+
    "\1\52\5\0\1\53\1\0\1\54\22\0\1\52\4\0"+
    "\1\55\22\0\1\56\1\0\3\52\3\0\1\57\4\0"+
    "\1\60\13\0\1\61\1\0\1\62\23\0\1\63\1\64"+
    "\1\50\20\0\2\65\3\0\1\66\4\0\1\67\5\0"+
    "\1\70\13\0\1\71\5\0\1\72\6\0\1\73\1\74"+
    "\10\0\1\75\1\76\16\0\1\77\5\0\1\100\11\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[337];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\u0150\0\u0188"+
    "\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0\0\u02d8\0\u0310\0\u02d8"+
    "\0\u0348\0\u02d8\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460\0\u0498"+
    "\0\u04d0\0\u0508\0\u0540\0\u0578\0\u05b0\0\u05e8\0\u02d8\0\u02d8"+
    "\0\u02d8\0\u0620\0\u02d8\0\u02d8\0\u02d8\0\u02d8\0\u0658\0\u0690"+
    "\0\u02d8\0\u06c8\0\u02d8\0\u0700\0\u0738\0\u0770\0\u07a8\0\u07e0"+
    "\0\u02d8\0\u02d8\0\u0818\0\u0348\0\u0850\0\u0888\0\u08c0\0\u08f8"+
    "\0\u02d8\0\u02d8\0\u02d8\0\u0930\0\u0968\0\u02d8\0\u02d8\0\u09a0"+
    "\0\u02d8\0\u02d8\0\u02d8\0\u02d8\0\u09d8\0\u02d8\0\u0a10\0\u02d8"+
    "\0\u02d8\0\u02d8\0\u0a48\0\u02d8\0\u0a80\0\u0ab8\0\u0af0\0\u0b28"+
    "\0\u0b60\0\u0b98\0\u0bd0\0\u0c08\0\u0c40\0\u0c78\0\u0cb0\0\u0ce8"+
    "\0\u0d20\0\u0d58\0\u0d90\0\u0dc8\0\u0e00\0\u0658\0\u02d8\0\u0e38"+
    "\0\u0e70\0\u0ea8\0\u0ee0\0\u0f18\0\u0f50\0\u0818\0\u02d8\0\u0f88"+
    "\0\u0fc0\0\u0ff8\0\u1030\0\u1068\0\u09a0\0\u10a0\0\u10d8\0\u1110"+
    "\0\u1148\0\u1180\0\u11b8\0\u11f0\0\u1228\0\u1260\0\u1298\0\u12d0"+
    "\0\u1308\0\u1340\0\u1378\0\u13b0\0\u13e8\0\u1420\0\u1458\0\u1490"+
    "\0\u02d8\0\u14c8\0\u1500\0\u1538\0\u1570\0\u15a8\0\u15e0\0\u1618"+
    "\0\u1650\0\u1688\0\u16c0\0\u16f8\0\u1730\0\u1768\0\u17a0\0\u17d8"+
    "\0\u1810\0\u02d8\0\u1848\0\u1880\0\u18b8\0\u18f0\0\u1928\0\u1960"+
    "\0\u1998\0\u19d0\0\u1a08\0\u1a40\0\u1a78\0\u1ab0\0\u1ae8\0\u1b20"+
    "\0\u1b58\0\u1b90\0\u1bc8\0\u1c00\0\u1c38\0\u1c70\0\u1ca8\0\u1ce0"+
    "\0\u1d18\0\u02d8\0\u1d50\0\u1d88\0\u1dc0\0\u1df8\0\u1e30\0\u1e68"+
    "\0\u1ea0\0\u1ed8\0\u1f10\0\u1f48\0\u1f80\0\u1fb8\0\u1ff0\0\u2028"+
    "\0\u2060\0\u2098\0\u20d0\0\u2108\0\u02d8\0\u2140\0\u2178\0\u21b0"+
    "\0\u1c00\0\u21e8\0\u2220\0\u2258\0\u02d8\0\u2290\0\u22c8\0\u2300"+
    "\0\u2338\0\u02d8\0\u2370\0\u23a8\0\u23e0\0\u2418\0\u2450\0\u2488"+
    "\0\u24c0\0\u24f8\0\u2530\0\u2568\0\u25a0\0\u02d8\0\u25d8\0\u02d8"+
    "\0\u2610\0\u2178\0\u2648\0\u2680\0\u26b8\0\u26f0\0\u2728\0\u2760"+
    "\0\u2798\0\u27d0\0\u2808\0\u2840\0\u2878\0\u28b0\0\u28e8\0\u2920"+
    "\0\u2958\0\u2990\0\u29c8\0\u02d8\0\u02d8\0\u2a00\0\u2a38\0\u2a70"+
    "\0\u2aa8\0\u2ae0\0\u2b18\0\u2b50\0\u2b88\0\u2bc0\0\u2bf8\0\u2c30"+
    "\0\u2c68\0\u2ca0\0\u2cd8\0\u2d10\0\u2d48\0\u2d80\0\u1f80\0\u02d8"+
    "\0\u2db8\0\u2df0\0\u2e28\0\u02d8\0\u2e60\0\u2e98\0\u2ed0\0\u2f08"+
    "\0\u02d8\0\u2f40\0\u2f78\0\u2fb0\0\u2fe8\0\u3020\0\u02d8\0\u3058"+
    "\0\u3090\0\u30c8\0\u3100\0\u3138\0\u3170\0\u31a8\0\u31e0\0\u3218"+
    "\0\u3250\0\u3288\0\u02d8\0\u32c0\0\u32f8\0\u3330\0\u3368\0\u33a0"+
    "\0\u02d8\0\u33d8\0\u3410\0\u3448\0\u3480\0\u34b8\0\u34f0\0\u02d8"+
    "\0\u02d8\0\u3528\0\u3560\0\u3598\0\u35d0\0\u3608\0\u3640\0\u3678"+
    "\0\u36b0\0\u02d8\0\u02d8\0\u36e8\0\u3720\0\u3758\0\u3790\0\u37c8"+
    "\0\u3800\0\u3838\0\u3870\0\u38a8\0\u38e0\0\u3918\0\u3950\0\u3988"+
    "\0\u39c0\0\u02d8\0\u39f8\0\u3a30\0\u3a68\0\u3aa0\0\u3ad8\0\u3b10"+
    "\0\u3b48\0\u3b80\0\u3bb8\0\u3bf0\0\u3c28\0\u3c60\0\u3c98\0\u3cd0"+
    "\0\u3d08";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[337];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\16\1\17\1\20\1\17\26\16\1\21\1\22\1\16"+
    "\1\23\2\16\1\24\1\25\1\16\1\26\1\16\1\27"+
    "\1\30\2\16\1\31\2\16\1\32\1\33\1\34\1\35"+
    "\1\16\1\36\2\16\1\37\1\20\1\40\1\16\1\41"+
    "\1\42\1\43\1\42\2\44\1\45\1\46\1\47\2\41"+
    "\1\50\15\41\1\51\1\41\1\22\31\41\1\43\2\41"+
    "\1\0\1\52\1\20\1\52\2\53\27\0\1\54\1\0"+
    "\1\55\3\0\1\56\1\0\1\57\7\0\1\60\6\0"+
    "\1\61\1\20\1\62\1\0\1\41\1\17\1\43\1\17"+
    "\2\41\1\45\1\46\1\63\2\41\1\50\15\41\1\51"+
    "\1\64\1\22\7\41\1\65\6\41\1\66\6\41\1\67"+
    "\3\41\1\43\2\41\1\16\1\70\1\16\1\70\1\71"+
    "\1\72\2\16\1\73\2\74\1\16\1\74\2\16\12\74"+
    "\1\16\1\21\1\16\30\74\5\16\1\70\1\16\1\70"+
    "\1\71\1\72\2\16\1\73\2\75\1\16\1\75\2\16"+
    "\12\75\1\16\1\21\1\16\30\75\5\16\1\70\1\16"+
    "\1\70\1\76\1\77\6\16\1\100\15\16\1\21\36\16"+
    "\1\70\1\16\1\70\5\16\2\74\1\16\1\74\1\101"+
    "\1\16\12\74\1\16\1\21\1\16\30\74\5\16\1\70"+
    "\1\16\1\70\5\16\2\75\1\16\1\75\1\102\1\16"+
    "\12\75\1\16\1\21\1\16\30\75\5\16\1\70\1\16"+
    "\1\70\1\103\1\104\6\16\1\100\15\16\1\21\35\16"+
    "\1\0\1\52\1\0\1\52\1\0\1\105\3\0\2\105"+
    "\1\0\1\105\1\0\1\106\12\105\3\0\30\105\5\0"+
    "\1\52\1\0\1\52\1\0\1\107\3\0\2\107\1\0"+
    "\1\107\1\0\1\106\12\107\3\0\30\107\4\0\2\110"+
    "\1\20\61\110\1\111\1\20\1\112\1\110\71\0\1\17"+
    "\1\0\1\17\7\0\1\113\56\0\1\114\62\0\1\114"+
    "\56\0\1\115\54\0\1\116\110\0\1\117\62\0\1\120"+
    "\64\0\1\121\52\0\1\122\12\0\1\123\54\0\1\124"+
    "\102\0\1\125\7\0\1\126\50\0\1\127\16\0\1\130"+
    "\62\0\1\131\51\0\1\132\3\0\1\133\67\0\1\134"+
    "\27\0\1\42\1\0\1\42\7\0\1\135\55\0\1\136"+
    "\1\137\1\136\61\0\1\137\15\0\1\140\55\0\1\52"+
    "\1\0\1\52\140\0\1\141\66\0\1\142\71\0\1\143"+
    "\63\0\1\144\76\0\1\145\10\0\1\146\1\147\1\146"+
    "\61\0\1\147\57\0\1\150\47\0\1\151\73\0\1\152"+
    "\27\0\1\70\1\0\1\70\7\0\1\153\65\0\2\74"+
    "\1\0\1\74\2\0\12\74\3\0\30\74\15\0\2\75"+
    "\1\0\1\75\2\0\12\75\3\0\30\75\16\0\1\154"+
    "\1\0\1\155\60\0\1\105\3\0\2\105\1\0\1\105"+
    "\2\0\12\105\3\0\30\105\11\0\1\107\3\0\2\107"+
    "\1\0\1\107\2\0\12\107\3\0\30\107\17\0\1\156"+
    "\130\0\1\157\67\0\1\160\72\0\1\161\63\0\1\162"+
    "\73\0\1\163\71\0\1\164\53\0\1\165\67\0\1\166"+
    "\102\0\1\167\45\0\1\170\105\0\1\171\65\0\1\172"+
    "\75\0\1\173\64\0\1\174\1\175\67\0\1\176\66\0"+
    "\1\177\25\0\1\200\54\0\2\140\2\0\63\140\46\0"+
    "\1\201\73\0\1\202\71\0\1\203\70\0\1\204\65\0"+
    "\1\205\70\0\1\206\65\0\1\207\73\0\1\210\25\0"+
    "\1\211\70\0\1\212\53\0\2\156\2\0\63\156\51\0"+
    "\1\213\60\0\1\214\27\0\3\161\60\0\1\215\63\0"+
    "\1\216\50\0\1\217\63\0\1\220\104\0\1\221\67\0"+
    "\1\222\60\0\1\223\74\0\1\224\72\0\1\225\35\0"+
    "\1\226\1\0\1\227\121\0\1\230\55\0\1\231\73\0"+
    "\1\232\77\0\1\233\66\0\1\234\11\0\2\200\2\0"+
    "\63\200\55\0\1\235\73\0\1\236\57\0\1\237\76\0"+
    "\1\240\70\0\1\241\50\0\1\242\104\0\1\243\11\0"+
    "\2\211\2\0\63\211\1\0\2\244\2\0\10\244\1\245"+
    "\52\244\46\0\1\246\15\0\1\247\56\0\1\250\15\0"+
    "\66\251\1\0\1\251\54\0\1\252\63\0\1\253\61\0"+
    "\1\254\74\0\1\255\65\0\1\256\67\0\1\257\100\0"+
    "\1\260\51\0\1\261\77\0\1\262\56\0\1\263\71\0"+
    "\1\264\104\0\1\265\12\0\3\233\60\0\1\266\50\0"+
    "\1\267\67\0\1\270\76\0\1\271\54\0\1\272\73\0"+
    "\1\273\76\0\1\274\30\0\1\275\117\0\1\276\33\0"+
    "\2\277\1\0\1\300\2\0\12\277\4\0\27\277\4\0"+
    "\2\244\2\0\5\244\2\301\1\244\1\245\2\244\12\301"+
    "\4\244\27\301\3\244\40\0\1\302\104\0\1\303\53\0"+
    "\1\304\27\0\66\251\1\305\1\251\50\0\1\306\101\0"+
    "\1\307\6\0\3\310\24\0\1\311\33\0\1\312\55\0"+
    "\1\313\73\0\1\314\56\0\1\315\63\0\1\316\106\0"+
    "\1\317\50\0\1\320\105\0\1\321\10\0\2\265\2\0"+
    "\60\265\1\322\2\265\1\0\66\323\1\0\1\323\53\0"+
    "\1\324\64\0\1\325\34\0\1\326\123\0\1\327\67\0"+
    "\1\325\33\0\1\330\125\0\1\331\25\0\2\277\1\0"+
    "\1\277\2\0\12\277\4\0\27\277\4\0\2\332\2\0"+
    "\5\332\2\277\1\332\1\300\2\332\12\277\4\332\27\277"+
    "\3\332\36\0\1\333\102\0\1\334\60\0\1\335\73\0"+
    "\1\336\23\0\3\307\60\0\1\337\4\0\3\310\60\0"+
    "\1\312\50\0\1\340\100\0\1\341\55\0\1\342\102\0"+
    "\1\343\11\0\3\344\14\0\1\345\43\0\1\346\46\0"+
    "\1\347\43\0\1\350\4\0\1\351\62\0\1\350\50\0"+
    "\2\352\2\353\62\352\1\265\1\353\66\323\1\354\1\323"+
    "\52\0\1\355\56\0\1\356\67\0\1\357\100\0\1\360"+
    "\74\0\1\361\70\0\1\362\61\0\1\363\63\0\1\364"+
    "\21\0\66\365\1\0\1\365\54\0\1\366\14\0\3\341"+
    "\60\0\1\367\26\0\1\370\117\0\1\371\15\0\3\344"+
    "\60\0\1\346\56\0\1\372\14\0\66\373\1\0\1\373"+
    "\45\0\1\374\75\0\1\375\55\0\1\376\26\0\2\352"+
    "\2\353\62\352\1\377\67\353\1\u0100\1\353\17\0\1\u0101"+
    "\2\0\1\u0102\117\0\1\u0103\32\0\1\u0104\117\0\1\u0105"+
    "\65\0\1\u0106\63\0\1\u0107\31\0\3\364\60\0\1\u0108"+
    "\3\0\66\365\1\u0109\1\365\1\0\3\366\60\0\1\u010a"+
    "\3\0\66\u010b\1\0\1\u010b\50\0\1\u010c\74\0\1\u010d"+
    "\67\0\1\u010e\12\0\66\373\1\u010f\1\373\52\0\1\u0110"+
    "\66\0\1\u0111\75\0\1\u0112\60\0\1\u0113\71\0\1\u0114"+
    "\74\0\1\u0115\63\0\1\u0116\61\0\1\u0117\67\0\1\u0118"+
    "\22\0\66\u0119\1\0\1\u0119\66\u011a\1\0\1\u011a\66\u010b"+
    "\1\u011b\1\u010b\60\0\1\u011c\54\0\1\u011d\50\0\1\u011e"+
    "\70\0\1\u011f\114\0\1\u0120\71\0\1\u0121\46\0\1\u0122"+
    "\102\0\1\u0123\54\0\1\u0124\104\0\1\u0125\67\0\1\u0126"+
    "\56\0\1\u0127\26\0\66\u0119\1\u0128\1\u0119\66\u011a\1\u0129"+
    "\1\u011a\43\0\1\u012a\65\0\1\u012b\73\0\1\u012c\63\0"+
    "\1\u012d\63\0\1\u012e\110\0\1\u012f\74\0\1\201\63\0"+
    "\1\u0130\11\0\3\u0125\60\0\1\u0131\20\0\1\u0132\130\0"+
    "\1\u0133\56\0\1\u0134\100\0\1\u0135\36\0\1\u0136\117\0"+
    "\1\u0137\71\0\1\u0138\66\0\1\u0139\56\0\1\u013a\22\0"+
    "\66\u013b\1\0\1\u013b\52\0\1\341\16\0\3\u0135\60\0"+
    "\1\u013c\44\0\1\u013d\73\0\1\u013e\67\0\1\u013f\76\0"+
    "\1\u0140\66\0\1\u0141\14\0\66\u013b\1\u0142\1\u013b\66\u0143"+
    "\1\0\1\u0143\56\0\1\u0144\53\0\1\u0145\63\0\1\u0146"+
    "\66\0\1\u0147\104\0\1\201\15\0\66\u0143\1\u0148\1\u0143"+
    "\57\0\1\u0149\55\0\1\u014a\67\0\1\u014b\101\0\1\u014c"+
    "\12\0\1\u014d\62\0\1\u014d\60\0\1\344\52\0\1\u014e"+
    "\76\0\1\u014f\63\0\1\201\111\0\1\u0148\56\0\1\341"+
    "\57\0\1\u0150\101\0\1\u0151\73\0\1\u0132\4\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[15680];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\15\0\1\11\1\1\1\11\1\1\1\11\14\1\3\11"+
    "\1\1\4\11\2\1\1\11\1\1\1\11\5\0\2\11"+
    "\6\1\3\11\2\1\2\11\1\1\4\11\1\1\1\11"+
    "\1\1\3\11\1\0\1\11\22\0\1\11\1\1\6\0"+
    "\1\11\6\0\1\1\21\0\1\1\1\11\7\0\2\1"+
    "\5\0\1\1\1\0\1\11\22\0\1\1\4\0\1\11"+
    "\22\0\1\11\1\0\3\1\3\0\1\11\4\0\1\11"+
    "\13\0\1\11\1\0\1\11\23\0\2\11\1\1\20\0"+
    "\1\1\1\11\3\0\1\11\4\0\1\11\5\0\1\11"+
    "\13\0\1\11\5\0\1\11\6\0\2\11\10\0\2\11"+
    "\16\0\1\11\5\0\1\1\11\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[337];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
  public BuildGradleLexer() {
    this((java.io.Reader)null);
  }
  private int  genericBracketsCounter = 0;
  private int dependenciesBracketsCounter = 0;
  private boolean DependenciesStarted = false;
  private boolean secondEnclosingSignForMap = false;

  private void checkIfReturnToMapDependency() {
      if(secondEnclosingSignForMap) {
          secondEnclosingSignForMap = false;
          yybegin(MAP_DEPENDENCY);
        }
      else {
           secondEnclosingSignForMap = true;
        }
  }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public BuildGradleLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  return;
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { yybegin(YYINITIAL); return BAD_CHARACTER;
            }
          // fall through
          case 65: break;
          case 2:
            { return SPACE_CHARACTER;
            }
          // fall through
          case 66: break;
          case 3:
            { return CRLF;
            }
          // fall through
          case 67: break;
          case 4:
            { return BACKSLASH;
            }
          // fall through
          case 68: break;
          case 5:
            { return RSBRACE;
            }
          // fall through
          case 69: break;
          case 6:
            { return LCURBRACE;
            }
          // fall through
          case 70: break;
          case 7:
            { return RCURBRACE;
            }
          // fall through
          case 71: break;
          case 8:
            { return BAD_CHARACTER;
            }
          // fall through
          case 72: break;
          case 9:
            { yybegin(HANDLE_DEPENDENCIES); return CRLF;
            }
          // fall through
          case 73: break;
          case 10:
            { yybegin(EXTRACT_GROUP_STRING);
            }
          // fall through
          case 74: break;
          case 11:
            { return LPARENTHESIS;
            }
          // fall through
          case 75: break;
          case 12:
            { return RPARENTHESIS;
            }
          // fall through
          case 76: break;
          case 13:
            { return LSBRACE;
            }
          // fall through
          case 77: break;
          case 14:
            { yybegin(STRING_DEPENDENCY); yypushback(yylength());
            }
          // fall through
          case 78: break;
          case 15:
            { dependenciesBracketsCounter++ ; return LCURBRACE;
            }
          // fall through
          case 79: break;
          case 16:
            { if(--dependenciesBracketsCounter == 0) {
                                    yybegin(YYINITIAL);}  return RCURBRACE;
            }
          // fall through
          case 80: break;
          case 17:
            { return QUATATION_MARK;
            }
          // fall through
          case 81: break;
          case 18:
            { return APOSTROPHE;
            }
          // fall through
          case 82: break;
          case 19:
            { yybegin(MAP_DEPENDENCY); return COMMA;
            }
          // fall through
          case 83: break;
          case 20:
            { return GROUP_ID;
            }
          // fall through
          case 84: break;
          case 21:
            { return ARTIFACT_ID;
            }
          // fall through
          case 85: break;
          case 22:
            { this.checkIfReturnToMapDependency(); return QUATATION_MARK;
            }
          // fall through
          case 86: break;
          case 23:
            { this.checkIfReturnToMapDependency(); return APOSTROPHE;
            }
          // fall through
          case 87: break;
          case 24:
            { yybegin(EXTRACT_ARTIFACT_STRING); return COLON;
            }
          // fall through
          case 88: break;
          case 25:
            { yybegin(EXTRACT_VERSION_STRING); return COLON;
            }
          // fall through
          case 89: break;
          case 26:
            { yybegin(STRING_DEPENDENCY); return QUATATION_MARK;
            }
          // fall through
          case 90: break;
          case 27:
            { yybegin(STRING_DEPENDENCY);  return APOSTROPHE;
            }
          // fall through
          case 91: break;
          case 28:
            { yybegin(YYINITIAL); return ROOT_GROUP_VERSION_VALUE;
            }
          // fall through
          case 92: break;
          case 29:
            { return EQUALS;
            }
          // fall through
          case 93: break;
          case 30:
            { yybegin(YYINITIAL); return ROOT_GENERIC_VALUE;
            }
          // fall through
          case 94: break;
          case 31:
            { return JLINK_COMPONENT;
            }
          // fall through
          case 95: break;
          case 32:
            { genericBracketsCounter++ ; return LCURBRACE;
            }
          // fall through
          case 96: break;
          case 33:
            { if (--genericBracketsCounter == 0) {
                                     yybegin(YYINITIAL);} return RCURBRACE;
            }
          // fall through
          case 97: break;
          case 34:
            { 
            }
          // fall through
          case 98: break;
          case 35:
            { yybegin(STRING_DEPENDENCY);
            }
          // fall through
          case 99: break;
          case 36:
            { yybegin(HANDLE_DEPENDENCIES); return COMMENT;
            }
          // fall through
          case 100: break;
          case 37:
            { yybegin(MAP_DEPENDENCY);
            }
          // fall through
          case 101: break;
          case 38:
            { return LINE_COMMENT;
            }
          // fall through
          case 102: break;
          case 39:
            { yybegin(HANDLE_DEPENDENCIES); return LINE_COMMENT;
            }
          // fall through
          case 103: break;
          case 40:
            { return CONFIG_NAME;
            }
          // fall through
          case 104: break;
          case 41:
            { yybegin(YYINITIAL); return LINE_COMMENT;
            }
          // fall through
          case 105: break;
          case 42:
            { return VERSION;
            }
          // fall through
          case 106: break;
          case 43:
            { return JAVA;
            }
          // fall through
          case 107: break;
          case 44:
            { return MAIN;
            }
          // fall through
          case 108: break;
          case 45:
            { yybegin(GET_ROOT_VALUES); return ROOT_GROUP_KEY;
            }
          // fall through
          case 109: break;
          case 46:
            { yybegin(HANDLE_ARTIFACT); return NAME_KEY;
            }
          // fall through
          case 110: break;
          case 47:
            { return EXT;
            }
          // fall through
          case 111: break;
          case 48:
            { yybegin(BYPASS_UNNECESSARY_BLOCK); genericBracketsCounter++; return JLINK_START;
            }
          // fall through
          case 112: break;
          case 49:
            { yybegin(MAP_DEPENDENCY); yypushback(yylength());
            }
          // fall through
          case 113: break;
          case 50:
            { yybegin(HANDLE_GROUP);  return GROUP_KEY;
            }
          // fall through
          case 114: break;
          case 51:
            { return TEST;
            }
          // fall through
          case 115: break;
          case 52:
            { yybegin(GET_ROOT_VALUES); return ROOT_VERSION_KEY;
            }
          // fall through
          case 116: break;
          case 53:
            { return TASKS;
            }
          // fall through
          case 117: break;
          case 54:
            { yybegin(HANDLE_VERSION); return VERSION_KEY;
            }
          // fall through
          case 118: break;
          case 55:
            { return JAVAFX;
            }
          // fall through
          case 119: break;
          case 56:
            { return RUNIDE;
            }
          // fall through
          case 120: break;
          case 57:
            { return PLUGINS;
            }
          // fall through
          case 121: break;
          case 58:
            { return SOURCE_SETS;
            }
          // fall through
          case 122: break;
          case 59:
            { return INTELLIJ;
            }
          // fall through
          case 123: break;
          case 60:
            { return JLINKZIP;
            }
          // fall through
          case 124: break;
          case 61:
            { yybegin(GET_GENERIC_VALUES); return ROOT_GENERIC_KEY;
            }
          // fall through
          case 125: break;
          case 62:
            { yybegin(HANDLE_DEPENDENCIES); return DEPENDENCIES;
            }
          // fall through
          case 126: break;
          case 63:
            { return APPLICATION;
            }
          // fall through
          case 127: break;
          case 64:
            { return REPOSITORIES;
            }
          // fall through
          case 128: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
