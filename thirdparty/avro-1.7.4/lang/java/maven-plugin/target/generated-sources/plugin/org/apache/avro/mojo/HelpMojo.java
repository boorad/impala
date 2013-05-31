package org.apache.avro.mojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * Display help information on avro-maven-plugin.<br/> Call <pre>  mvn avro:help -Ddetail=true -Dgoal=&lt;goal-name&gt;</pre> to display parameter details.
 *
 * @version generated on Tue May 21 04:19:10 CEST 2013
 * @author org.apache.maven.tools.plugin.generator.PluginHelpGenerator (version 2.9)
 * @goal help
 * @requiresProject false
 * @threadSafe
 */
public class HelpMojo
    extends AbstractMojo
{
    /**
     * If <code>true</code>, display all settable properties for each goal.
     * 
     * @parameter expression="${detail}" default-value="false"
     */
    private boolean detail;

    /**
     * The name of the goal for which to show help. If unspecified, all goals will be displayed.
     * 
     * @parameter expression="${goal}"
     */
    private java.lang.String goal;

    /**
     * The maximum length of a display line, should be positive.
     * 
     * @parameter expression="${lineLength}" default-value="80"
     */
    private int lineLength;

    /**
     * The number of spaces per indentation level, should be positive.
     * 
     * @parameter expression="${indentSize}" default-value="2"
     */
    private int indentSize;


    /** {@inheritDoc} */
    public void execute()
        throws MojoExecutionException
    {
        if ( lineLength <= 0 )
        {
            getLog().warn( "The parameter 'lineLength' should be positive, using '80' as default." );
            lineLength = 80;
        }
        if ( indentSize <= 0 )
        {
            getLog().warn( "The parameter 'indentSize' should be positive, using '2' as default." );
            indentSize = 2;
        }

        StringBuffer sb = new StringBuffer();

        append( sb, "org.apache.avro:avro-maven-plugin:1.7.4", 0 );
        append( sb, "", 0 );

        append( sb, "Apache Avro Maven Plugin", 0 );
        append( sb, "Maven plugin for Avro IDL and Specific API Compilers", 1 );
        append( sb, "", 0 );

        if ( goal == null || goal.length() <= 0 )
        {
            append( sb, "This plugin has 4 goals:", 0 );
            append( sb, "", 0 );
        }

        if ( goal == null || goal.length() <= 0 || "help".equals( goal ) )
        {
            append( sb, "avro:help", 0 );
            append( sb, "Display help information on avro-maven-plugin.\nCall\n\u00a0\u00a0mvn\u00a0avro:help\u00a0-Ddetail=true\u00a0-Dgoal=<goal-name>\nto display parameter details.", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "detail (Default: false)", 2 );
                append( sb, "If true, display all settable properties for each goal.", 3 );
                append( sb, "Expression: ${detail}", 3 );
                append( sb, "", 0 );

                append( sb, "goal", 2 );
                append( sb, "The name of the goal for which to show help. If unspecified, all goals will be displayed.", 3 );
                append( sb, "Expression: ${goal}", 3 );
                append( sb, "", 0 );

                append( sb, "indentSize (Default: 2)", 2 );
                append( sb, "The number of spaces per indentation level, should be positive.", 3 );
                append( sb, "Expression: ${indentSize}", 3 );
                append( sb, "", 0 );

                append( sb, "lineLength (Default: 80)", 2 );
                append( sb, "The maximum length of a display line, should be positive.", 3 );
                append( sb, "Expression: ${lineLength}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "idl-protocol".equals( goal ) )
        {
            append( sb, "avro:idl-protocol", 0 );
            append( sb, "Generate Java classes and interfaces from AvroIDL files (.avdl)", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "createSetters (Default: true)", 2 );
                append( sb, "Determines whether or not to create setters for the fields of the record. The default is to create setters.", 3 );
                append( sb, "", 0 );

                append( sb, "excludes", 2 );
                append( sb, "A set of Ant-like exclusion patterns used to prevent certain files from being processed. By default, this set is empty such that no files are excluded.", 3 );
                append( sb, "", 0 );

                append( sb, "fieldVisibility (Default: PUBLIC_DEPRECATED)", 2 );
                append( sb, "The field visibility indicator for the fields of the generated class, as string values of SpecificCompiler.FieldVisibility. The text is case insensitive.", 3 );
                append( sb, "", 0 );

                append( sb, "imports", 2 );
                append( sb, "A list of files or directories that should be compiled first thus making them importable by subsequently compiled schemas. Note that imported files should not reference each other.", 3 );
                append( sb, "", 0 );

                append( sb, "includes", 2 );
                append( sb, "A set of Ant-like inclusion patterns used to select files from the source directory for processing. By default, the pattern **/*.avdl is used to select IDL files.", 3 );
                append( sb, "", 0 );

                append( sb, "outputDirectory (Default: ${project.build.directory}/generated-sources/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "sourceDirectory (Default: ${basedir}/src/main/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${sourceDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "stringType", 2 );
                append( sb, "The Java type to use for Avro strings. May be one of CharSequence, String or Utf8. CharSequence by default.", 3 );
                append( sb, "Expression: ${stringType}", 3 );
                append( sb, "", 0 );

                append( sb, "templateDirectory", 2 );
                append( sb, "The directory (within the java classpath) that contains the velocity templates to use for code generation. The default value points to the templates included with the avro-maven-plugin.", 3 );
                append( sb, "Expression: ${templateDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "testExcludes", 2 );
                append( sb, "A set of Ant-like exclusion patterns used to prevent certain files from being processed. By default, this set is empty such that no files are excluded.", 3 );
                append( sb, "", 0 );

                append( sb, "testIncludes", 2 );
                append( sb, "A set of Ant-like inclusion patterns used to select files from the source directory for processing. By default, the pattern **/*.avdl is used to select IDL files.", 3 );
                append( sb, "", 0 );

                append( sb, "testOutputDirectory (Default: ${project.build.directory}/generated-test-sources/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "testSourceDirectory (Default: ${basedir}/src/test/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${sourceDirectory}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "protocol".equals( goal ) )
        {
            append( sb, "avro:protocol", 0 );
            append( sb, "Generate Java classes and interfaces from Avro protocol files (.avpr)", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "createSetters (Default: true)", 2 );
                append( sb, "Determines whether or not to create setters for the fields of the record. The default is to create setters.", 3 );
                append( sb, "", 0 );

                append( sb, "excludes", 2 );
                append( sb, "A set of Ant-like exclusion patterns used to prevent certain files from being processed. By default, this set is empty such that no files are excluded.", 3 );
                append( sb, "", 0 );

                append( sb, "fieldVisibility (Default: PUBLIC_DEPRECATED)", 2 );
                append( sb, "The field visibility indicator for the fields of the generated class, as string values of SpecificCompiler.FieldVisibility. The text is case insensitive.", 3 );
                append( sb, "", 0 );

                append( sb, "imports", 2 );
                append( sb, "A list of files or directories that should be compiled first thus making them importable by subsequently compiled schemas. Note that imported files should not reference each other.", 3 );
                append( sb, "", 0 );

                append( sb, "includes", 2 );
                append( sb, "A set of Ant-like inclusion patterns used to select files from the source directory for processing. By default, the pattern **/*.avpr is used to select grammar files.", 3 );
                append( sb, "", 0 );

                append( sb, "outputDirectory (Default: ${project.build.directory}/generated-sources/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "sourceDirectory (Default: ${basedir}/src/main/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${sourceDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "stringType", 2 );
                append( sb, "The Java type to use for Avro strings. May be one of CharSequence, String or Utf8. CharSequence by default.", 3 );
                append( sb, "Expression: ${stringType}", 3 );
                append( sb, "", 0 );

                append( sb, "templateDirectory", 2 );
                append( sb, "The directory (within the java classpath) that contains the velocity templates to use for code generation. The default value points to the templates included with the avro-maven-plugin.", 3 );
                append( sb, "Expression: ${templateDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "testExcludes", 2 );
                append( sb, "A set of Ant-like exclusion patterns used to prevent certain files from being processed. By default, this set is empty such that no files are excluded.", 3 );
                append( sb, "", 0 );

                append( sb, "testIncludes", 2 );
                append( sb, "A set of Ant-like inclusion patterns used to select files from the source directory for processing. By default, the pattern **/*.avpr is used to select grammar files.", 3 );
                append( sb, "", 0 );

                append( sb, "testOutputDirectory (Default: ${project.build.directory}/generated-test-sources/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "testSourceDirectory (Default: ${basedir}/src/test/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${sourceDirectory}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( goal == null || goal.length() <= 0 || "schema".equals( goal ) )
        {
            append( sb, "avro:schema", 0 );
            append( sb, "Generate Java classes from Avro schema files (.avsc)", 1 );
            append( sb, "", 0 );
            if ( detail )
            {
                append( sb, "Available parameters:", 1 );
                append( sb, "", 0 );

                append( sb, "createSetters (Default: true)", 2 );
                append( sb, "Determines whether or not to create setters for the fields of the record. The default is to create setters.", 3 );
                append( sb, "", 0 );

                append( sb, "excludes", 2 );
                append( sb, "A set of Ant-like exclusion patterns used to prevent certain files from being processed. By default, this set is empty such that no files are excluded.", 3 );
                append( sb, "", 0 );

                append( sb, "fieldVisibility (Default: PUBLIC_DEPRECATED)", 2 );
                append( sb, "The field visibility indicator for the fields of the generated class, as string values of SpecificCompiler.FieldVisibility. The text is case insensitive.", 3 );
                append( sb, "", 0 );

                append( sb, "imports", 2 );
                append( sb, "A list of files or directories that should be compiled first thus making them importable by subsequently compiled schemas. Note that imported files should not reference each other.", 3 );
                append( sb, "", 0 );

                append( sb, "includes", 2 );
                append( sb, "A set of Ant-like inclusion patterns used to select files from the source directory for processing. By default, the pattern **/*.avsc is used to select grammar files.", 3 );
                append( sb, "", 0 );

                append( sb, "outputDirectory (Default: ${project.build.directory}/generated-sources/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "sourceDirectory (Default: ${basedir}/src/main/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${sourceDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "stringType", 2 );
                append( sb, "The Java type to use for Avro strings. May be one of CharSequence, String or Utf8. CharSequence by default.", 3 );
                append( sb, "Expression: ${stringType}", 3 );
                append( sb, "", 0 );

                append( sb, "templateDirectory", 2 );
                append( sb, "The directory (within the java classpath) that contains the velocity templates to use for code generation. The default value points to the templates included with the avro-maven-plugin.", 3 );
                append( sb, "Expression: ${templateDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "testExcludes", 2 );
                append( sb, "A set of Ant-like exclusion patterns used to prevent certain files from being processed. By default, this set is empty such that no files are excluded.", 3 );
                append( sb, "", 0 );

                append( sb, "testIncludes", 2 );
                append( sb, "A set of Ant-like inclusion patterns used to select files from the source directory for processing. By default, the pattern **/*.avsc is used to select grammar files.", 3 );
                append( sb, "", 0 );

                append( sb, "testOutputDirectory (Default: ${project.build.directory}/generated-test-sources/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${outputDirectory}", 3 );
                append( sb, "", 0 );

                append( sb, "testSourceDirectory (Default: ${basedir}/src/test/avro)", 2 );
                append( sb, "(no description available)", 3 );
                append( sb, "Expression: ${sourceDirectory}", 3 );
                append( sb, "", 0 );
            }
        }

        if ( getLog().isInfoEnabled() )
        {
            getLog().info( sb.toString() );
        }
    }

    /**
     * <p>Repeat a String <code>n</code> times to form a new string.</p>
     *
     * @param str String to repeat
     * @param repeat number of times to repeat str
     * @return String with repeated String
     * @throws NegativeArraySizeException if <code>repeat < 0</code>
     * @throws NullPointerException if str is <code>null</code>
     */
    private static String repeat( String str, int repeat )
    {
        StringBuffer buffer = new StringBuffer( repeat * str.length() );

        for ( int i = 0; i < repeat; i++ )
        {
            buffer.append( str );
        }

        return buffer.toString();
    }

    /** 
     * Append a description to the buffer by respecting the indentSize and lineLength parameters.
     * <b>Note</b>: The last character is always a new line.
     * 
     * @param sb The buffer to append the description, not <code>null</code>.
     * @param description The description, not <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     */
    private void append( StringBuffer sb, String description, int indent )
    {
        for ( Iterator it = toLines( description, indent, indentSize, lineLength ).iterator(); it.hasNext(); )
        {
            sb.append( it.next().toString() ).append( '\n' );
        }
    }

    /** 
     * Splits the specified text into lines of convenient display length.
     * 
     * @param text The text to split into lines, must not be <code>null</code>.
     * @param indent The base indentation level of each line, must not be negative.
     * @param indentSize The size of each indentation, must not be negative.
     * @param lineLength The length of the line, must not be negative.
     * @return The sequence of display lines, never <code>null</code>.
     * @throws NegativeArraySizeException if <code>indent < 0</code>
     */
    private static List toLines( String text, int indent, int indentSize, int lineLength )
    {
        List lines = new ArrayList();

        String ind = repeat( "\t", indent );
        String[] plainLines = text.split( "(\r\n)|(\r)|(\n)" );
        for ( int i = 0; i < plainLines.length; i++ )
        {
            toLines( lines, ind + plainLines[i], indentSize, lineLength );
        }

        return lines;
    }

    /** 
     * Adds the specified line to the output sequence, performing line wrapping if necessary.
     * 
     * @param lines The sequence of display lines, must not be <code>null</code>.
     * @param line The line to add, must not be <code>null</code>.
     * @param indentSize The size of each indentation, must not be negative.
     * @param lineLength The length of the line, must not be negative.
     */
    private static void toLines( List lines, String line, int indentSize, int lineLength )
    {
        int lineIndent = getIndentLevel( line );
        StringBuffer buf = new StringBuffer( 256 );
        String[] tokens = line.split( " +" );
        for ( int i = 0; i < tokens.length; i++ )
        {
            String token = tokens[i];
            if ( i > 0 )
            {
                if ( buf.length() + token.length() >= lineLength )
                {
                    lines.add( buf.toString() );
                    buf.setLength( 0 );
                    buf.append( repeat( " ", lineIndent * indentSize ) );
                }
                else
                {
                    buf.append( ' ' );
                }
            }
            for ( int j = 0; j < token.length(); j++ )
            {
                char c = token.charAt( j );
                if ( c == '\t' )
                {
                    buf.append( repeat( " ", indentSize - buf.length() % indentSize ) );
                }
                else if ( c == '\u00A0' )
                {
                    buf.append( ' ' );
                }
                else
                {
                    buf.append( c );
                }
            }
        }
        lines.add( buf.toString() );
    }

    /** 
     * Gets the indentation level of the specified line.
     * 
     * @param line The line whose indentation level should be retrieved, must not be <code>null</code>.
     * @return The indentation level of the line.
     */
    private static int getIndentLevel( String line )
    {
        int level = 0;
        for ( int i = 0; i < line.length() && line.charAt( i ) == '\t'; i++ )
        {
            level++;
        }
        for ( int i = level + 1; i <= level + 4 && i < line.length(); i++ )
        {
            if ( line.charAt( i ) == '\t' )
            {
                level++;
                break;
            }
        }
        return level;
    }
}
