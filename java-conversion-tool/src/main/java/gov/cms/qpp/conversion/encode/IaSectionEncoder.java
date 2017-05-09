package gov.cms.qpp.conversion.encode;

import gov.cms.qpp.conversion.model.Encoder;
import gov.cms.qpp.conversion.model.TemplateId;

/**
 * Encoder to serialize Improvement Activity Section. This class is nearly empty due to the fact that it does the same
 * encoding as its super class {@link gov.cms.qpp.conversion.encode.AciSectionEncoder} but is a different templateId.
 */
@Encoder(TemplateId.IA_SECTION)
public class IaSectionEncoder extends AciSectionEncoder {
	//empty as it does the exact same thing as its parent class
}
