/**
 * generated by Xtext 2.32.0
 */
package org.example.restdsl.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.example.restdsl.restDsl.Entity;
import org.example.restdsl.restDsl.Field;
import org.example.restdsl.restDsl.Logic;
import org.example.restdsl.restDsl.Operation;
import org.example.restdsl.restDsl.RestApi;
import org.example.restdsl.restDsl.Type;

@SuppressWarnings("all")
public class RestDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(resource.getAllContents());
    for (final EObject element : _iterable) {
      if ((element instanceof Entity)) {
        this.generateEntity(((Entity) element), fsa);
      } else {
        if ((element instanceof RestApi)) {
          this.generateRestApi(((RestApi) element), fsa);
        }
      }
    }
  }

  public void generateEntity(final Entity entity, final IFileSystemAccess2 fsa) {
    String _name = entity.getName();
    String _plus = ("models/" + _name);
    String _plus_1 = (_plus + ".java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Generate code for Entity");
    _builder.newLine();
    _builder.append("// You can implement the logic to generate Spring Boot code here");
    _builder.newLine();
    _builder.append("// Use entity.name, entity.fields, etc.");
    _builder.newLine();
    _builder.append("// Example:");
    _builder.newLine();
    _builder.append("package generated;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = entity.getName();
    _builder.append(_name_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// Fields");
    _builder.newLine();
    {
      EList<Field> _fields = entity.getFields();
      for(final Field field : _fields) {
        _builder.append("    ");
        _builder.append("private ");
        String _type = field.getType();
        _builder.append(_type, "    ");
        _builder.append(" ");
        String _name_2 = field.getName();
        _builder.append(_name_2, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Getters and setters");
    _builder.newLine();
    {
      EList<Field> _fields_1 = entity.getFields();
      for(final Field field_1 : _fields_1) {
        _builder.append("    ");
        _builder.append("public ");
        String _type_1 = field_1.getType();
        _builder.append(_type_1, "    ");
        _builder.append(" get");
        String _firstUpper = StringExtensions.toFirstUpper(field_1.getName());
        _builder.append(_firstUpper, "    ");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return ");
        String _name_3 = field_1.getName();
        _builder.append(_name_3, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("public void set");
        String _firstUpper_1 = StringExtensions.toFirstUpper(field_1.getName());
        _builder.append(_firstUpper_1, "    ");
        _builder.append("(");
        String _type_2 = field_1.getType();
        _builder.append(_type_2, "    ");
        _builder.append(" ");
        String _name_4 = field_1.getName();
        _builder.append(_name_4, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("this.");
        String _name_5 = field_1.getName();
        _builder.append(_name_5, "        ");
        _builder.append(" = ");
        String _name_6 = field_1.getName();
        _builder.append(_name_6, "        ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus_1, _builder);
  }

  public void generateRestApi(final RestApi restApi, final IFileSystemAccess2 fsa) {
    String _name = restApi.getName();
    String _plus = ("controllers/" + _name);
    String _plus_1 = (_plus + "Controller.java");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Generate code for RestApi Controller");
    _builder.newLine();
    _builder.append("// You can implement the logic to generate Spring Boot code here");
    _builder.newLine();
    _builder.append("// Use restApi.name, restApi.path, restApi.operations, etc.");
    _builder.newLine();
    _builder.append("// Example:");
    _builder.newLine();
    _builder.append("package generated;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.springframework.web.bind.annotation.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@RestController");
    _builder.newLine();
    _builder.append("@RequestMapping(\"");
    String _path = restApi.getPath();
    _builder.append(_path);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(restApi.getName());
    _builder.append(_firstUpper);
    _builder.append("Controller {");
    _builder.newLineIfNotEmpty();
    {
      EList<Operation> _operations = restApi.getOperations();
      for(final Operation operation : _operations) {
        _builder.append("    ");
        _builder.append("@RequestMapping(value = \"");
        String _path_1 = operation.getPath();
        _builder.append(_path_1, "    ");
        _builder.append("\", method = RequestMethod.");
        String _upperCase = operation.getMethod().toUpperCase();
        _builder.append(_upperCase, "    ");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("public ");
        String _type = operation.getResponse().getType();
        _builder.append(_type, "    ");
        _builder.append(" ");
        String _name_1 = operation.getName();
        _builder.append(_name_1, "    ");
        _builder.append("(");
        {
          Type _request = operation.getRequest();
          boolean _notEquals = (!Objects.equal(_request, null));
          if (_notEquals) {
            _builder.append("@RequestBody ");
            String _type_1 = operation.getRequest().getType();
            _builder.append(_type_1, "    ");
            _builder.append(" request");
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("// Implementation for the operation logic");
        _builder.newLine();
        {
          Logic _logic = operation.getLogic();
          boolean _notEquals_1 = (!Objects.equal(_logic, null));
          if (_notEquals_1) {
            _builder.append("    ");
            _builder.append("    ");
            String _implementation = operation.getLogic().getImplementation();
            _builder.append(_implementation, "        ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile(_plus_1, _builder);
  }
}