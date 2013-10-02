
/* First created by JCasGen Tue Oct 01 22:31:14 EDT 2013 */
package edu.cmu.lti.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import edu.cmu.lti.util.type.ComponentAnnotation_Type;

/** 
 * Updated by JCasGen Tue Oct 01 22:31:14 EDT 2013
 * @generated */
public class DbpediaAnnotation_Type extends ComponentAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DbpediaAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DbpediaAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DbpediaAnnotation(addr, DbpediaAnnotation_Type.this);
  			   DbpediaAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DbpediaAnnotation(addr, DbpediaAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DbpediaAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.type.DbpediaAnnotation");
 
  /** @generated */
  final Feature casFeat_Uri;
  /** @generated */
  final int     casFeatCode_Uri;
  /** @generated */ 
  public String getUri(int addr) {
        if (featOkTst && casFeat_Uri == null)
      jcas.throwFeatMissing("Uri", "edu.cmu.lti.type.DbpediaAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Uri);
  }
  /** @generated */    
  public void setUri(int addr, String v) {
        if (featOkTst && casFeat_Uri == null)
      jcas.throwFeatMissing("Uri", "edu.cmu.lti.type.DbpediaAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_Uri, v);}
    
  
 
  /** @generated */
  final Feature casFeat_similarityScore;
  /** @generated */
  final int     casFeatCode_similarityScore;
  /** @generated */ 
  public double getSimilarityScore(int addr) {
        if (featOkTst && casFeat_similarityScore == null)
      jcas.throwFeatMissing("similarityScore", "edu.cmu.lti.type.DbpediaAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_similarityScore);
  }
  /** @generated */    
  public void setSimilarityScore(int addr, double v) {
        if (featOkTst && casFeat_similarityScore == null)
      jcas.throwFeatMissing("similarityScore", "edu.cmu.lti.type.DbpediaAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_similarityScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_resourceType;
  /** @generated */
  final int     casFeatCode_resourceType;
  /** @generated */ 
  public int getResourceType(int addr) {
        if (featOkTst && casFeat_resourceType == null)
      jcas.throwFeatMissing("resourceType", "edu.cmu.lti.type.DbpediaAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_resourceType);
  }
  /** @generated */    
  public void setResourceType(int addr, int v) {
        if (featOkTst && casFeat_resourceType == null)
      jcas.throwFeatMissing("resourceType", "edu.cmu.lti.type.DbpediaAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_resourceType, v);}
    
  
 
  /** @generated */
  final Feature casFeat_abstract;
  /** @generated */
  final int     casFeatCode_abstract;
  /** @generated */ 
  public String getAbstract(int addr) {
        if (featOkTst && casFeat_abstract == null)
      jcas.throwFeatMissing("abstract", "edu.cmu.lti.type.DbpediaAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_abstract);
  }
  /** @generated */    
  public void setAbstract(int addr, String v) {
        if (featOkTst && casFeat_abstract == null)
      jcas.throwFeatMissing("abstract", "edu.cmu.lti.type.DbpediaAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_abstract, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DbpediaAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Uri = jcas.getRequiredFeatureDE(casType, "Uri", "uima.cas.String", featOkTst);
    casFeatCode_Uri  = (null == casFeat_Uri) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Uri).getCode();

 
    casFeat_similarityScore = jcas.getRequiredFeatureDE(casType, "similarityScore", "uima.cas.Double", featOkTst);
    casFeatCode_similarityScore  = (null == casFeat_similarityScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_similarityScore).getCode();

 
    casFeat_resourceType = jcas.getRequiredFeatureDE(casType, "resourceType", "uima.cas.StringList", featOkTst);
    casFeatCode_resourceType  = (null == casFeat_resourceType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_resourceType).getCode();

 
    casFeat_abstract = jcas.getRequiredFeatureDE(casType, "abstract", "uima.cas.String", featOkTst);
    casFeatCode_abstract  = (null == casFeat_abstract) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_abstract).getCode();

  }
}



    