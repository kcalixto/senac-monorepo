import { TextInput, View } from "react-native"

export default function App() {
  return (
    <View style={styles.container}>
      <>
        <TextInput
          style={styles.inputs.nome}
          placeholder="Digite seu Nome Completo"
        />
      </>
    </View>
  );
}

const styles = StyleSheet.create({
  inputs: {
    nome: {
      fontSize: 20,
      borderColor: "black",
      borderWidth: 1,
      padding: 10,
    }
  },

  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
    margin: 10,
    borderColor: "red",
    borderWidth: 1,
  }
});