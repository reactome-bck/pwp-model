package org.reactome.web.pwp.model.client.classes;

import com.google.gwt.json.client.JSONObject;
import org.reactome.web.pwp.model.client.factory.SchemaClass;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
@Deprecated
public class EntityCompartment extends Compartment {

    public EntityCompartment() {
        this(SchemaClass.ENTITY_COMPARTMENT);
    }

    public EntityCompartment(SchemaClass schemaClass) {
        super(schemaClass);
    }

    @Override
    public void load(JSONObject jsonObject) {
        super.load(jsonObject);
    }
}
