

/* First created by JCasGen Tue Oct 01 20:45:43 EDT 2013 */
package edu.cmu.lti.util.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 01 22:31:14 EDT 2013
 * XML source: /Users/hector/Documents/homeworks/11791/services/services-zhengzhl/src/main/resources/ExternalAnnotationTypeSystem.xml
 * @generated */
public class ComponentAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ComponentAnnotation.class);
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
  protected ComponentAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ComponentAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ComponentAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ComponentAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: componentId

  /** getter for componentId - gets This type can be used for various purposes, including differentiating system annotation from gold standard annotation.
   * @generated */
  public String getComponentId() {
    if (ComponentAnnotation_Type.featOkTst && ((ComponentAnnotation_Type)jcasType).casFeat_componentId == null)
      jcasType.jcas.throwFeatMissing("componentId", "edu.cmu.lti.util.type.ComponentAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ComponentAnnotation_Type)jcasType).casFeatCode_componentId);}
    
  /** setter for componentId - sets This type can be used for various purposes, including differentiating system annotation from gold standard annotation. 
   * @generated */
  public void setComponentId(String v) {
    if (ComponentAnnotation_Type.featOkTst && ((ComponentAnnotation_Type)jcasType).casFeat_componentId == null)
      jcasType.jcas.throwFeatMissing("componentId", "edu.cmu.lti.util.type.ComponentAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((ComponentAnnotation_Type)jcasType).casFeatCode_componentId, v);}    
  }

    