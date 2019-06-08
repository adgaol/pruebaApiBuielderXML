package pruebaapiascendente;


//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import apicreatorxml.Writer;
import apicreatorxml.Paso;
import apicreatorxml.Node;
import java.util.HashSet;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\003\000\002\002\004\000\002\003" +
    "\005\000\002\011\003\000\002\004\005\000\002\004\002" +
    "\000\002\007\003\000\002\005\004\000\002\012\003\000" +
    "\002\006\005\000\002\006\002\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\004\004\007\001\002\000\010\005\ufff7\006" +
    "\021\007\ufff7\001\002\000\004\002\020\001\002\000\004" +
    "\002\001\001\002\000\010\005\ufff9\006\ufff9\007\ufff9\001" +
    "\002\000\006\005\013\007\ufffc\001\002\000\004\007\016" +
    "\001\002\000\004\004\007\001\002\000\004\004\ufffb\001" +
    "\002\000\006\005\013\007\ufffc\001\002\000\004\007\ufffd" +
    "\001\002\000\004\002\ufffe\001\002\000\004\002\uffff\001" +
    "\002\000\004\002\000\001\002\000\004\004\ufff6\001\002" +
    "\000\004\004\007\001\002\000\006\005\ufffa\007\ufffa\001" +
    "\002\000\010\005\ufff7\006\021\007\ufff7\001\002\000\006" +
    "\005\ufff8\007\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\023\000\012\002\004\003\005\005\007\012\003\001" +
    "\001\000\006\006\022\010\021\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\004\010\007" +
    "\011\001\001\000\004\011\016\001\001\000\006\005\013" +
    "\012\003\001\001\000\002\001\001\000\006\004\014\007" +
    "\011\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\012" +
    "\023\001\001\000\002\001\001\000\006\006\024\010\021" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


Writer writer = new Writer("./gramatica.txt","./ascendent","./cadenaDePrueba.txt",false);


  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // EXP1 ::= EXP 
            {
              Object RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp exp = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    System.out.println(exp.getValue());

    
    writer.writeXML();

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP1",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= EXP1 EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // EXP ::= B A PUNTOCOMA 
            {
              Exp RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		B b = (B)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		A a = (A)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int pcleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pcright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		PuntoComa pc = (PuntoComa)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    Exp exp=new Exp();
    exp.setValue(b.getValue()+a.getValue());
    HashSet<Integer> relNodo=new HashSet<>();
    relNodo.add(b.getId());
    relNodo.add(a.getId());
    relNodo.add(pc.getId());
    Paso paso=writer.addPaso(false,null,"EXP", null, null,relNodo);
    exp.setId(paso.getId());
    b.getPaso().setRegla("EXP::= B A ;");
    Node nodo=writer.addNode("EXP", false,null);
    b.getNode().setFatherNode(nodo);
    a.getNode().setFatherNode(nodo);
    pc.getNode().setFatherNode(nodo);
    RESULT=exp;
    

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // PUNTOCOMA ::= puntoComa 
            {
              PuntoComa RESULT =null;
		
    PuntoComa puntComa=new PuntoComa();
    
    Paso paso=writer.addPaso(true,";",";", null, null);
    puntComa.setId(paso.getId());
    puntComa.setPaso(paso);
    Node nodo =writer.addNode(";", true,null);
    puntComa.setNode(nodo);
    RESULT=puntComa;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PUNTOCOMA",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // A ::= MAS B A 
            {
              A RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Mas m = (Mas)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		B b = (B)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int a1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int a1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		A a1 = (A)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    A a=new A();
    a.setValue(b.getValue()+a1.getValue());
    HashSet<Integer> relNodo=new HashSet<>();
    relNodo.add(b.getId());
    relNodo.add(a1.getId());
    relNodo.add(m.getId());
    m.getPaso().setRegla("A::= + B A1");
    Paso paso=writer.addPaso(false,null,"A", "A.result="+a.getValue().toString(), null,relNodo);
    a.setPaso(paso);
    a.setId(paso.getId());
    Node nodo=writer.addNode("A", false,null);
    m.getNode().setFatherNode(nodo);
    b.getNode().setFatherNode(nodo);
    a1.getNode().setFatherNode(nodo);
    a.setNode(nodo);
    RESULT=a;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // A ::= 
            {
              A RESULT =null;
		
    A a=new A();
    a.setValue(0);
    Paso paso=writer.addPaso(true,null,"λ",null,"A::= λ ");
    paso=writer.addPaso(false,null,"A1","A1.result="+a.getValue().toString(),null,paso.getId());
    a.setId(paso.getId());
    a.setPaso(paso);
    Node nodoL=writer.addNode("λ", true,null);
    Node nodo=writer.addNode("A1", false,null);
    nodoL.setFatherNode(nodo);
    a.setNode(nodo);
    RESULT=a;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("A",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // MAS ::= mas 
            {
              Mas RESULT =null;
		
    Mas plus=new Mas();
    Paso paso=writer.addPaso(true,"+","+", null, null);
    plus.setId(paso.getId());
    plus.setPaso(paso);
    Node nodo= writer.addNode("+", true,null);
    plus.setNode(nodo);
    RESULT =plus;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("MAS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // B ::= NUM C 
            {
              B RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Num num = (Num)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		C c = (C)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    B b=new B();
    b.setValue(num.getValue()*c.getValue());
    HashSet<Integer> relNodo=new HashSet<>();
    relNodo.add(c.getId());
    relNodo.add(num.getId());
    num.getPaso().setRegla("B::= num C");
    Paso paso=writer.addPaso(false,null,"B","B.result=" +b.getValue().toString(), null,relNodo);
    b.setId(paso.getId());
    Node nodo=writer.addNode("B", false,null);
    b.setPaso(paso);
    num.getNode().setFatherNode(nodo);
    c.getNode().setFatherNode(nodo);
    b.setNode(nodo);
    RESULT=b;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // NUM ::= constint 
            {
              Num RESULT =null;
		int numberleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numberright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String number = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    Num num=new Num();
    num.setValue(Integer.parseInt(number));
    Paso paso=writer.addPaso(true,"num","num","num.vlex="+ number, null);
    num.setId(paso.getId());
    num.setPaso(paso);
    Node node=writer.addNode("num", true,null);
    num.setNode(node);
    RESULT=num;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("NUM",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // C ::= POR NUM C 
            {
              C RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Por p = (Por)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Num num = (Num)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int c1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int c1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		C c1 = (C)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    C c=new C();
    c.setValue(num.getValue()*c1.getValue());
    HashSet<Integer> relNodo=new HashSet<>();
    relNodo.add(p.getId());
    relNodo.add(num.getId());
    relNodo.add(c1.getId());
    Paso paso=writer.addPaso(false,null,"C", "C.result="+c.getValue().toString(), null,relNodo);
    c.setId(paso.getId());
    c.setPaso(paso);
    p.getPaso().setRegla("C::= * num C1");
    
    Node nodo=writer.addNode("C1", false,null);
    p.getNode().setFatherNode(nodo);
    num.getNode().setFatherNode(nodo);
    c1.getNode().setFatherNode(nodo);
    c.setNode(nodo);
    RESULT=c;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // C ::= 
            {
              C RESULT =null;
		
    C c=new C();
    c.setValue(1);
    Paso paso=writer.addPaso(true,null,"λ", null,"C::= λ ");
    paso=writer.addPaso(false,null,"C1", "C1.result="+c.getValue().toString(),null, paso.getId());
    c.setId(paso.getId());
    c.setPaso(paso);
    Node nodeL=writer.addNode("λ", true,null);
    Node node=writer.addNode("C", false,null);
    nodeL.setFatherNode(node);
    c.setNode(node);
    RESULT=c;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("C",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // POR ::= por 
            {
              Por RESULT =null;
		
    Por mult=new Por();
    Paso paso=writer.addPaso(true,"*","*", null, null);
    mult.setId(paso.getId());
    mult.setPaso(paso);
    Node node=writer.addNode("*", true,null);
    mult.setNode(node);
    RESULT=mult;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("POR",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
