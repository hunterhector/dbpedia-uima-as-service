

/* First created by JCasGen Tue Oct 01 22:31:14 EDT 2013 */
package edu.cmu.lti.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.lti.util.type.ComponentAnnotation;
import org.apache.uima.jcas.cas.StringList;


/** 
 * Updated by JCasGen Tue Oct 01 22:31:14 EDT 2013
 * XML source: /Users/hector/Documents/homeworks/11791/services/services-zhengzhl/src/main/resources/ExternalAnnotationTypeSystem.xml
 * @generated */
public class DbpediaAnnotation extends ComponentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DbpediaAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DbpediaAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DbpediaAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DbpediaAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DbpediaAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Uri

  /** getter for Uri - gets 
   * @generated */
  public String getUri() {
    if (DbpediaAnnotation_Type.featOkTst && ((DbpediaAnnotation_Type)jcasType).casFeat_Uri == null)
      jcasType.jcas.throwFeatMissing("Uri", "edu.cmu.lti.type.DbpediaAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DbpediaAnnotation_Type)jcasType).casFeatCode_Uri);}
    
  /** setter for Uri - sets  
   * @generated */
  public void setUri(String v) {
    if (DbpediaAnnotation_Type.featOkTst && ((DbpediaAnnotation_Type)jcasType).casFeat_Uri == null)
      jcasType.jcas.throwFeatMissing("Uri", "edu.cmu.lti.type.DbpediaAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DbpediaAnnotation_Type)jcasType).casFeatCode_Uri, v);}    
   
    
  //*--------------*
  //* Feature: similarityScore

  /** getter for similarityScore - gets 
   * @generated */
  public double getSimilarityScore() {
    if (DbpediaAnnotation_Type.featOkTst && ((DbpediaAnnotation_Type)jcasType).casFeat_similarityScore == null)
      jcasType.jcas.throwFeatMissing("similarityScore", "edu.cmu.lti.type.DbpediaAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((DbpediaAnnotation_Type)jcasType).casFeatCode_similarityScore);}
    
  /** setter for similarityScore - sets  
   * @generated */
  public void setSimilarityScore(double v) {
    if (DbpediaAnnotation_Type.featOkTst && ((DbpediaAnnotation_Type)jcasType).casFeat_similarityScore == null)
      jcasType.jcas.throwFeatMissing("similarityScore", "edu.cmu.lti.type.DbpediaAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((DbpediaAnnotation_Type)jcasType).casFeatCode_similarityScore, v);}    
   
    
  //*--------------*
  //* Feature: resourceType

  /** getter for resourceType - gets 
   * @generated */
  public StringList getResourceType() {
    if (DbpediaAnnotation_Type.featOkTst && ((DbpediaAnnotation_Type)jcasType).casFeat_resourceType == null)
      jcasType.jcas.throwFeatMissing("resourceType", "edu.cmu.lti.type.DbpediaAnnotation");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DbpediaAnnotation_Type)jcasType).casFeatCode_resourceType)));}
    
  /** setter for resourceType - sets  
   * @generated */
  public void setResourceType(StringList v) {
    if (DbpediaAnnotation_Type.featOkTst && ((DbpediaAnnotation_Type)jcasType).casFeat_resourceType == null)
      jcasType.jcas.throwFeatMissing("resourceType", "edu.cmu.lti.type.DbpediaAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((DbpediaAnnotation_Type)jcasType).casFeatCode_resourceType, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: abstract

  /** getter for abstract - gets Abstract on the wikipedia page of the returned entity
   * @generated */
  public String getAbstract() {
    if (DbpediaAnnotation_Type.featOkTst && ((DbpediaAnnotation_Type)jcasType).casFeat_abstract == null)
      jcasType.jcas.throwFeatMissing("abstract", "edu.cmu.lti.type.DbpediaAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DbpediaAnnotation_Type)jcasType).casFeatCode_abstract);}
    
  /** setter for abstract - sets Abstract on the wikipedia page of the returned entity 
   * @generated */
  public void setAbstract(String v) {
    if (DbpediaAnnotation_Type.featOkTst && ((DbpediaAnnotation_Type)jcasType).casFeat_abstract == null)
      jcasType.jcas.throwFeatMissing("abstract", "edu.cmu.lti.type.DbpediaAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DbpediaAnnotation_Type)jcasType).casFeatCode_abstract, v);}    
  }

    