// Generated from C:/Users/Dooj/Desktop/CPEN 221/mp5/src/ca/ece/ubc/cpen221/mp5/antlr\Query.g4 by ANTLR 4.5.1
package ca.ece.ubc.cpen221.mp5.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, RANGE=6, LPAREN=7, RPAREN=8, OR=9, 
		AND=10, STRING=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "RANGE", "LPAREN", "RPAREN", "OR", 
		"AND", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'in'", "'category'", "'name'", "'rating'", "'price'", null, "'('", 
		"')'", "'||'", "'&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "RANGE", "LPAREN", "RPAREN", "OR", 
		"AND", "STRING", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        //removeErrorListeners();

	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\f\3\f\3\r\6\rT\n\r\r\r\16\rU\3\r\3\r"+
		"\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\5"+
		"\3\2\63\67\6\2\"\"\62;C\\c|\5\2\13\f\17\17\"\"Z\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2"+
		"\2\2\5\36\3\2\2\2\7\'\3\2\2\2\t,\3\2\2\2\13\63\3\2\2\2\r9\3\2\2\2\17?"+
		"\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25F\3\2\2\2\27I\3\2\2\2\31S\3\2\2\2\33"+
		"\34\7k\2\2\34\35\7p\2\2\35\4\3\2\2\2\36\37\7e\2\2\37 \7c\2\2 !\7v\2\2"+
		"!\"\7g\2\2\"#\7i\2\2#$\7q\2\2$%\7t\2\2%&\7{\2\2&\6\3\2\2\2\'(\7p\2\2("+
		")\7c\2\2)*\7o\2\2*+\7g\2\2+\b\3\2\2\2,-\7t\2\2-.\7c\2\2./\7v\2\2/\60\7"+
		"k\2\2\60\61\7p\2\2\61\62\7i\2\2\62\n\3\2\2\2\63\64\7r\2\2\64\65\7t\2\2"+
		"\65\66\7k\2\2\66\67\7e\2\2\678\7g\2\28\f\3\2\2\29:\t\2\2\2:;\7\60\2\2"+
		";<\7\60\2\2<=\3\2\2\2=>\t\2\2\2>\16\3\2\2\2?@\7*\2\2@\20\3\2\2\2AB\7+"+
		"\2\2B\22\3\2\2\2CD\7~\2\2DE\7~\2\2E\24\3\2\2\2FG\7(\2\2GH\7(\2\2H\26\3"+
		"\2\2\2IM\7$\2\2JL\t\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3"+
		"\2\2\2OM\3\2\2\2PQ\7$\2\2Q\30\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2US"+
		"\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\b\r\2\2X\32\3\2\2\2\6\2KMU\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}